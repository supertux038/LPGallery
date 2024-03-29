<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="/WEB-INF/views/includes/header.incl.jsp" %>
<%@ include file="/WEB-INF/views/includes/navigation.incl.jsp" %>

<main>
    <div class="container align-content-center">
        <div class="row flex">
            <div class="col-lg-3 col-xl-2 d-sm-flex d-lg-block navigation mt-lg-5 pt-lg-3" id="leftNavbar">
                <ul class="nav flex-column pt-4">
                    <li class="nav-item">
                        <h5>Категории</h5>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Общее</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Транспорт</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Ландшафт</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Персонажи</a>
                    </li>
                </ul>
                <ul class="nav flex-column pt-4 pl-sm-5 pl-lg-0">
                    <li class="nav-item">
                        <h5>Сложность</h5>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Неоцененные</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Простые</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Средней сложности</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Сложные</a>
                    </li>
                </ul>
            </div>
            <div class="col-lg-9 col-xl-10 main-content overflow-hidden">
                <h3 class="pt-5 pb-3" id="best-examples-title">Лучшие по мнению администрации <span
                        class="badge badge-secondary">Появится в будущих обновлениях</span></h3>
                <div class="models-rendres-slider pb-lg-5">
                    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <a href="${pageContext.request.contextPath}/model-page?id=3">
                                <div class="carousel-item active">
                                    <img class="d-block w-100" src="img/renders/86lp.png"
                                         alt="First slide">
                                    <div class="carousel-caption d-none d-md-block">
                                        <h5>AE 86</h5>
                                        <p>Автор
                                            <a href="${pageContext.request.contextPath}/user?id=11">@supertux038</a>
                                        </p>
                                    </div>
                                </div>
                            </a>
                            <div class="carousel-item">
                                <img class="d-block w-100"
                                     src="img/renders/sheep.png"
                                     alt="Second slide">
                                <div class="carousel-caption d-none d-md-block">
                                    <h5>Овечка</h5>
                                    <p>Автор @anonimus</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100"
                                     src="img/renders/FF.png"
                                     alt="Second slide">
                                <div class="carousel-caption d-none d-md-block">
                                    <h5>Горный берег</h5>
                                    <p>Автор @supertux038</p>
                                </div>
                            </div>
                            <a class="carousel-control-prev" href="#carouselExampleControls" role="button"
                               data-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="carousel-control-next" href="#carouselExampleControls" role="button"
                               data-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>
                        </div>
                    </div>
                </div>
                <h4 class="py-3" id="descriptions-title">Описания</h4>
                <div class="accordion mb-5" id="descriptions">
                    <div class="card">
                        <div class="card-header" id="headingOne">
                            <h5 class="mb-0">
                                <button class="btn btn-link" type="button" data-toggle="collapse"
                                        data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                    AE 86
                                </button>
                            </h5>
                        </div>

                        <div id="collapseOne" class="collapse" aria-labelledby="headingOne"
                             data-parent="#descriptions">
                            <div class="card-body">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus, accusantium alias
                                culpa dolores earum ipsa molestias sit tempore. Amet aut cupiditate est facere illum,
                                impedit ipsam laboriosam, laborum laudantium libero magni minima nulla, provident
                                repellendus saepe sapiente suscipit tenetur vitae!
                            </div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-header" id="headingTwo">
                            <h5 class="mb-0">
                                <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                                        data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                    Какой-то овечки
                                </button>
                            </h5>
                        </div>
                        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
                             data-parent="#descriptions">
                            <div class="card-body">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi cupiditate delectus
                                distinctio doloribus ducimus eligendi enim eveniet facilis hic ipsam ipsum non officiis,
                                pariatur placeat soluta vel vitae voluptas voluptate.
                            </div>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-header" id="headingThree">
                            <h5 class="mb-0">
                                <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                                        data-target="#collapseThree" aria-expanded="false"
                                        aria-controls="collapseThree">
                                    Левитирующего острова
                                </button>
                            </h5>
                        </div>
                        <div id="collapseThree" class="collapse" aria-labelledby="headingThree"
                             data-parent="#descriptions">
                            <div class="card-body">
                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad
                                squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck
                                quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
                                squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica,
                                craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur
                                butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth
                                nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
                            </div>
                        </div>
                    </div>
                </div>
                <div class="contnent">
                    <h4 class="py-3" id="some-text-title">${content.getTextTitle()}</h4>
                    <p>
                        ${content.getText()}
                    </p>
<%--                    <c:if test="${not empty admin-button}">--%>
                        <div>
                            <a href="${pageContext.request.contextPath}/edit-text" class="btn btn-primary mb-3">Редактировать
                                текст</a>
                        </div>
<%--                    </c:if>--%>
                </div>
                <h4 class="mb-3" id="lessons-title">Модели</h4>
                <div class="mb-5 d-flex row" id="lessons">
                    <div class="col-3">
                        <div class="card">
                            <img class="card-img-top" src="/static/user-data/images/renders/86lp.png" alt="AE 86">
                            <div class="card-body">
                                <h5 class="card-title">AE 86</h5>
                                <p class="card-text">Создаем модельку с нуля с помощью чертежа и простейших операций с
                                    мешем</p>
                                <a href="model_page.html" class="btn btn-primary">Открыть страницу</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="card">
                            <img class="card-img-top" src="../../static/user-data/images/renders/FF.png" alt="LP landscape">
                            <div class="card-body">
                                <h5 class="card-title">Пейзаж</h5>
                                <p class="card-text">Создаем низкополигональный пейзаж с деревьями, океаном и горой.</p>
                                <a href="#" class="btn btn-primary disabled">Открыть урок</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<%@ include file="/WEB-INF/views/includes/login-modal.incl.jsp" %>

<%@ include file="/WEB-INF/views/includes/footer.incl.jsp" %>

