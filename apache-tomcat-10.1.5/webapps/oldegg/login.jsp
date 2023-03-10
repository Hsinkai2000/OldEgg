<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>OldEgg | Log In</title><link rel="icon" href="./images/oldegg-icon.ico" type="image/x-icon">
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
      crossorigin="anonymous"
    />
    <link href="./style/style.css" rel="stylesheet" />
  </head>
  <body class="bg_default">
    <div class="d-flex">
      <img
        class="flex-fill w-50 vh-100"
        style="object-fit: cover; object-position: bottom"
        src="./images/andre_tan_setup.jpg"
      />

      <div class="flex-fill align-self-center container w-50">
        <div class="row pb-4">
          <div class="col"></div>
          <div class="col">
            <a href="index.jsp">
              <img src="./images/oldegg-icon.png" width="200px" />
            </a>
          </div>
          <div class="col"></div>
        </div>
        <div class="row pb-4">
          <div class="col-3"></div>
          <div class="col-6">
            <h2>Login</h2>
          </div>
          <div class="col"></div>
        </div>
        <form method="get" action="login">
          <div class="form-group pb-3">
            <div class="form-row row">
              <div class="col-3"></div>
              <div class="col-6">
                <label for="inputEmail"><h7>Email</h7></label>
              </div>
              <div class="col-3"></div>
            </div>
            <div class="form-row row">
              <div class="col-3"></div>
              <div class="col-6">
                <input
                  type="email"
                  class="form-control"
                  id="inputEmail"
                  placeholder="example@example.com"
                  name="email"
                  required
                />
              </div>
              <div class="col-3"></div>
            </div>
          </div>
          <div class="form-group pb-4">
            <div class="form-row row">
              <div class="col-3"></div>
              <div class="col-6">
                <label for="inputPassword"><h7>Password</h7></label>
              </div>
              <div class="col-3"></div>
            </div>
            <div class="form-row row">
              <div class="col-3"></div>
              <div class="col-6">
                <input
                  type="password"
                  class="form-control"
                  id="inputPassword"
                  placeholder="***********"
                  name="password"
                  required
                />
              </div>
              <div class="col-3"></div>
            </div>
          </div>


          <div class="row">
            <div class="col-3"></div>
            <div class="col-6">
              <% if(request.getParameter("data") != null) { %>
              <p style="color: red"><%= request.getParameter("data") %></p>
              <%} else{%>
              <p></p>
              <%} %>
            </div>
            <div class="col-3"></div>
          </div>
          <% if(request.getParameter("listingId") != null) { %>
            <input type="hidden" name="listingId" value="<%=request.getParameter("listingId")%>">
          <% } %>
          <div class="row">
            <div class="col-3"></div>
            <div class="col-2">
              <button type="submit" id="" class="btn bg_orange">Sign in</button>
            </div>
            <div class="col-2">
              <button class="btn">
                <a class="underline" href="signup.jsp<%= request.getParameter("listingId") != null ? "?listingId=" + request.getParameter("listingId") : "" %>">Sign Up</a>
              </button>
            </div>
            <div class="col"></div>
          </div>
        </form>
      </div>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
