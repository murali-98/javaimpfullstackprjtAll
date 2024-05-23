<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>    
<head>  
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
      
    <title>Login Form</title>    
    <link rel="stylesheet" href="pages/style.css">    
</head>    
<body>    
    <h1>Login Page</h1><br>    
    <div class="login">    
    <form id="login" action="dashboard" method="post">    
        <label><b>Username     
        </b>    
        </label>    
        <input type="text" name="username" id="Uname" placeholder="Username">    
        <br><br>    
        <label><b>Password     
        </b>    
        </label>    
        <input type="password" name="passwrd" id="Pass" placeholder="Password"> 
        <i class="far fa-eye" id="togglePassword" style="margin-left: -30px; cursor: pointer;"></i>   
        <br><br>    
        <input type="submit" id="Log" value="Login" >     
        <br><br> 
        <h2>${message} </h2>     
    </form>     
</div>    
<script>
const togglePassword = document.querySelector('#togglePassword');
const password = document.querySelector('#Pass');

togglePassword.addEventListener('click', function (e) {
  // toggle the type attribute
  const type = password.getAttribute('type') === 'passwrd' ? 'text' : 'passwrd';
  password.setAttribute('type', type);
  // toggle the eye slash icon
  this.classList.toggle('fa-eye-slash');
});
</script>

</body>   
</html> 