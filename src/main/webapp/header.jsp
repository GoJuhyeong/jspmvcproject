<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="/index.jsp">게시판</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/index.jsp">Home</a>
        </li>
      </ul>
      <ul class="navbar-nav">
        <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    <i class="bi bi-person-circle"></i>
                  </a>
                  <ul class="dropdown-menu">
                      <c:choose>
                          <c:when test="${sessionScope.username != null}">
                              <li><a href="logout" class="dropdown-item">로그아웃</a></li>
                          </c:when>
                          <c:otherwise>
                              <li><a href="login.jsp" class="dropdown-item">로그인</a></li>
                              <li><a href="register.jsp" class="dropdown-item">회원가입</a></li>
                          </c:otherwise>
                      </c:choose>
                  </ul>
                </li>
      </ul>
    </div>
  </div>
</nav>
<!--
    <nav>
        <ul>
            <li>Home</li>
            <li>About</li>
            <li>Board</li>

        </ul>
    </nav>
-->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
</header>