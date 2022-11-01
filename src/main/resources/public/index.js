
function loadbases() {
    let user = document.getElementById("user");
    let password = document.getElementById("password");
     const xhttp = new XMLHttpRequest();
        xhttp.onload = function() {
               window.location.href = 'https://ec2-52-87-161-245.compute-1.amazonaws.com:1234/authe?user='+user.value+'&password='+password.value;

        }
         xhttp.open("GET", "/authe?user="+user.value+"&password"+password.value);
         xhttp.send();

    }