function validateForm() {
    document.getElementById('usernameError').innerHTML = '';
    document.getElementById('passwordError').innerHTML = '';
    document.getElementById('confirmPasswordError').innerHTML = '';
    document.getElementById('emailError').innerHTML = '';
    document.getElementById('mobileError').innerHTML = '';

    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var confirmPassword = document.getElementById('confirmPassword').value;
    var email = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;

    if (username.length < 5) {
      document.getElementById('usernameError').innerHTML = 'Username must be at least 5 characters';
      return;
    }

    if (password.length < 8) {
      document.getElementById('passwordError').innerHTML = 'Password must be at least 8 characters';
      return;
    }

    if (password !== confirmPassword) {
      document.getElementById('confirmPasswordError').innerHTML = 'Passwords do not match';
      return;
    }

    var pattern=/^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if(!pattern.test(email)){
        document.getElementById('emailError').innerHTML = 'Invalid email address';
        return;
    }
    
    var phonePattern = /^\d{10}$/;
      if (!phonePattern.test(mobile)) {
        document.getElementById('mobileError').innerHTML = 'Invalid phone number (10 digits)';
        return;
      }

    window.location.href = 'next.html';
  }