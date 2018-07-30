'use strict';

var AddError = document.querySelector('#AddError');
var AddSuccess = document.querySelector('#AddSuccess');

function handleSubmit() {
    var formData = new FormData();
    formData.append("file", $('#file')[0].files[0]);
    formData.append("appVersionInfo", {
        "appKey" : $('#appKey').val(),
        "versionName" : $('#versionName').val(),
        "versionCode" : $('#versionCode').val(),
        "updateStatus" : $('#updateStatus').val(),
        "modifyContent" : $('#modifyContent').val()
    });

    var xhr = new XMLHttpRequest();
    xhr.open("post", "/update/addAppVersion");

    xhr.onload = function() {
        console.log(xhr.responseText);
        if(xhr.status === 200) {
            AddError.style.display = "none";
            AddSuccess.innerHTML = xhr.responseText;
            AddSuccess.style.display = "block";
        } else {
            AddSuccess.style.display = "none";
            AddError.innerHTML = xhr.responseText;
        }
    };
    xhr.send(formData);
}


document.querySelector('#form').addEventListener('submit', function(event){

    handleSubmit();

    event.preventDefault();
}, true);

