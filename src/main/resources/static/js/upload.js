var versionId = 0; //保存的临时变量

function onAddInfo() {
    var form = document.getElementById('infoForm');
    var fd = new FormData(form);

    $.ajax({
        url: "/update/addVersionInfo",
        type: "POST",
        data: fd,
        dataType: "json",
        processData: false,  // 告诉jQuery不要去处理发送的数据
        contentType: false,   // 告诉jQuery不要去设置Content-Type请求头
        success: function (data) {
            if (data["Code"] === 0) {
                $('#result').html("版本信息保存成功！");
                versionId = data['Data']['versionId'];
            } else {
                $('#result').html("版本信息保存失败:" + data['Msg']);
            }
        },
        error: function (error) {
            $('#result').html("请求错误：" + JSON.stringify(error));
        }
    });
    return false;
}

function onUpload() {
    if (versionId === 0) {
        alert('请先填写应用版本信息!')
        return false;
    }

    var fd = new FormData();
    var files = document.querySelector('input[type=file]').files;
    fd.append("versionId", versionId);
    fd.append("file", files[0]);

    $.ajax({
        url: "/update/uploadApk",
        type: "POST",
        data: fd,
        dataType: "json",
        processData: false,  // 告诉jQuery不要去处理发送的数据
        contentType: false,   // 告诉jQuery不要去设置Content-Type请求头

        success: function (data) {
            if (data["Code"] === 0) {
                $('#result').html("APK文件上传成功！");
                versionId = data['Data']['versionId'];
            } else {
                $('#result').html("APK文件上传失败:" + data['Msg']);
            }
        },
        error: function (error) {
            $('#result').html("请求错误：" + error.toString());
        }
    });
    return false;
}