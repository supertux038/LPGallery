package ru.kpfu.itis.lpgallery.handlers;

import com.mysql.cj.jdbc.Driver;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Core;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Plugin(
        name = "MyAppender",
        category = Core.CATEGORY_NAME,
        elementType = Appender.ELEMENT_TYPE)
public class MyAppender extends AbstractAppender {

    private static final Connection connection;

    static {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpgallery?serverTimezone=UTC",
                    "root", "22zrsDJF7PlqIcsKcvFf");
        } catch (SQLException e) {
            throw new IllegalStateException("Unable to connect to log database", e);
        }
    }

    protected MyAppender(String name, Filter filter) {
        super(name, filter, null, false);
    }

    @PluginFactory
    public static MyAppender createAppender(
            @PluginAttribute("name") String name,
            @PluginElement("Filter") Filter filter) {
        return new MyAppender(name, filter);
    }

    @Override
    public void append(LogEvent event) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO logs (event, level) VALUES (?, ?)");
            statement.setString(1, event.getMessage().toString());
            statement.setString(2, event.getLevel().toString());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
