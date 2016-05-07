<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Registration | Flat Theme</title>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/font-awesome.min.css" rel="stylesheet">
    <link href="/resources/css/prettyPhoto.css" rel="stylesheet">
    <link href="/resources/css/animate.css" rel="stylesheet">
    <link href="/resources/css/main.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="/resources/js/html5shiv.js"></script>
    <script src="/resources/js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="/resources/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->
<body>
<header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"><img src="/resources/images/logo.png" alt="logo"></a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li ><a href="/index">Главная</a></li>
                <li ><a href="/about">О нас</a></li>

                <li><a href="/portfolio">Наши предложения</a></li>
                <li><a href="/career">Карьера в нашей компании</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Получить доступ <i class="icon-angle-down"></i></a>
                    <ul class="dropdown-menu">
                        <li class="active"><a href="/reg">Регистрация</a></li>
                        <li class="divider"></li>
                        <li><a href="/login">Войти</a></li>
                    </ul>
                </li>
                <li><a href="/blog">Микроблог</a></li>
                <li><a href="/contact">Напишите нам</a></li>
            </ul>
        </div>
    </div>
</header><!--/header-->


    <section id="title" class="emerald">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h1>Registration</h1>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                </div>
                <div class="col-sm-6">
                    <ul class="breadcrumb pull-right">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="#">Pages</a></li>
                        <li class="active">Registration</li>
                    </ul>
                </div>
            </div>
        </div>
    </section><!--/#title-->
<div class="account-in">
    <div class="container">
    <@form.form commandName="regForm" action="/reg" acceptCharset="UTF-8" method="post">
        <div class="register-top-grid">
            <h2>PERSONAL INFORMATION</h2>
        <#--<@form.errors path="*" cssStyle="color: red;" />-->
            <div>
                <span>First Name<label>*</label></span>
                <@form.input path="firstName" />
                <@form.errors path="firstName" cssStyle="color: red;" />
            </div>
            <div>
                <span>Last Name<label>*</label></span>
                <@form.input path="lastName" />
                <@form.errors path="lastName" cssStyle="color: red;" />
            </div>
            <div>
                <span>Email Address<label>*</label></span>
                <@form.input path="email" />
                <@form.errors path="email" cssStyle="color: red;" />
            </div>
            <div>
                <span>Phone<label>*</label></span>
                <@form.input path="phone" />
                <@form.errors path="phone" cssStyle="color: red;" />
            </div>
            <div class="clearfix"> </div>
            <i class="news-letter">
                <label class="">
                    <@form.checkbox path="signIn" />
                    <i> </i>Sign Up for Newsletter
                    <@form.errors path="signIn" cssStyle="color: red;" />
                </label>
            </i>
        </div>
        <div class="register-bottom-grid">
            <h2>LOGIN INFORMATION</h2>
            <div>
                <span>Password<label>*</label></span>
                <@form.password path="password" />
                <@form.errors path="password" cssStyle="color: red;" />
            </div>
            <div>
                <span>Confirm Password<label>*</label></span>
                <@form.password path="confirmPassword" />
                <@form.errors path="confirmPassword" cssStyle="color: red;" />
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
        <div class="register-but">
            <input type="submit" value="submit" class="btn btn-default">
            <div class="clearfix"> </div>
        </div>
    </@form.form>
    </div>
</div>

<#--<@form.form commandName="regForm" action="/reg" acceptCharset="UTF-8" method="post">
    <section id="registration" class="container">
        <form class="center" role="form">
            <fieldset class="registration-form">
                <div class="form-group">
                    <sp type="text" id="fitsName" name="firstName" placeholder="Firstnname" class="form-control">
                    <@form.input path="firstName" />
                    <@form.errors path="firstName" cssStyle="color: red;" />
                </div>
                <div class="form-group">
                    <input type="text" id="lastName" name="lastName" placeholder="Lastname" class="form-control">
                    <@form.input path="lastName" />
                    <@form.errors path="lastName" cssStyle="color: red;" />
                </div>
                <div class="form-group">
                    <input type="text" id="email" name="email" placeholder="E-mail" class="form-control">
                    <@form.input path="email" />
                    <@form.errors path="email" cssStyle="color: red;" />
                </div>
                <div class="form-group">
                    <input type="text" id="phone" name="phone" placeholder="Phone" class="form-control">
                    <@form.input path="phone" />
                    <@form.errors path="phone" cssStyle="color: red;" />
                </div>
                <div class="form-group">
                    <input type="password" id="password" name="password" placeholder="Password" class="form-control">
                    <@form.password path="password" />
                    <@form.errors path="password" cssStyle="color: red;" />
                </div>
                <div class="form-group">
                    <input type="password" id="password_confirm" name="password_confirm" placeholder="Password (Confirm)" class="form-control">
                    <@form.password path="confirmPassword" />
                    <@form.errors path="confirmPassword" cssStyle="color: red;" />
                </div>
                <div class="form-group">
                    <button class="btn btn-success btn-md btn-block">Register</button>
                </div>
            </fieldset>
        </form>
    </section><!--/#registration&ndash;&gt;
</@form.form>-->

    <section id="bottom" class="wet-asphalt">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <h4>About Us</h4>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</p>
                    <p>Pellentesque habitant morbi tristique senectus.</p>
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <h4>Company</h4>
                    <div>
                        <ul class="arrow">
                            <li><a href="#">The Company</a></li>
                            <li><a href="#">Our Team</a></li>
                            <li><a href="#">Our Partners</a></li>
                            <li><a href="#">Our Services</a></li>
                            <li><a href="#">Faq</a></li>
                            <li><a href="#">Conatct Us</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Terms of Use</a></li>
                            <li><a href="#">Copyright</a></li>
                        </ul>
                    </div>
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <h4>Latest Blog</h4>
                    <div>
                        <div class="media">
                            <div class="pull-left">
                                <img src="/resources/images/blog/thumb1.jpg" alt="">
                            </div>
                            <div class="media-body">
                                <span class="media-heading"><a href="#">Pellentesque habitant morbi tristique senectus</a></span>
                                <small class="muted">Posted 17 Aug 2013</small>
                            </div>
                        </div>
                        <div class="media">
                            <div class="pull-left">
                                <img src="/resources/images/blog/thumb2.jpg" alt="">
                            </div>
                            <div class="media-body">
                                <span class="media-heading"><a href="#">Pellentesque habitant morbi tristique senectus</a></span>
                                <small class="muted">Posted 13 Sep 2013</small>
                            </div>
                        </div>
                        <div class="media">
                            <div class="pull-left">
                                <img src="/resources/images/blog/thumb3.jpg" alt="">
                            </div>
                            <div class="media-body">
                                <span class="media-heading"><a href="#">Pellentesque habitant morbi tristique senectus</a></span>
                                <small class="muted">Posted 11 Jul 2013</small>
                            </div>
                        </div>
                    </div>  
                </div><!--/.col-md-3-->

                <div class="col-md-3 col-sm-6">
                    <h4>Address</h4>
                    <address>
                        <strong>Twitter, Inc.</strong><br>
                        795 Folsom Ave, Suite 600<br>
                        San Francisco, CA 94107<br>
                        <abbr title="Phone">P:</abbr> (123) 456-7890
                    </address>
                    <h4>Newsletter</h4>
                    <form role="form">
                        <div class="input-group">
                            <input type="text" class="form-control" autocomplete="off" placeholder="Enter your email">
                            <span class="input-group-btn">
                                <button class="btn btn-danger" type="button">Go!</button>
                            </span>
                        </div>
                    </form>
                </div> <!--/.col-md-3-->
            </div>
        </div>
    </section><!--/#bottom-->

    <footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    &copy; 2013 <a target="_blank" href="http://shapebootstrap.net/" title="Free Twitter Bootstrap WordPress Themes and HTML templates">ShapeBootstrap</a>. All Rights Reserved.
                </div>
                <div class="col-sm-6">
                    <ul class="pull-right">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Faq</a></li>
                        <li><a href="#">Contact Us</a></li>
                        <li><a id="gototop" class="gototop" href="#"><i class="icon-chevron-up"></i></a></li><!--#gototop-->
                    </ul>
                </div>
            </div>
        </div>
    </footer><!--/#footer-->

    <script src="/resources/js/jquery.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/jquery.prettyPhoto.js"></script>
    <script src="/resources/js/main.js"></script>
</body>
</html>