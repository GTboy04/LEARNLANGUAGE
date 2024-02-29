    //1. 验证 用户名是否符合规则：长度 6~12,单词字符组成
function blurUsername(){
    let value = document.getElementById("username").value
    let re = /^\w{6,12}$/
    if(re.test(value)){
        console.log("用户名没有问题san");
        document.getElementById("username_err").style = "display:none"
        return true
    }else{
        document.getElementById("username_err").style = "display:inline"
        return false
    }

}
let UserName = document.getElementById("username").addEventListener("blur",blurUsername)    

    //2. 验证 密码是否符合规则:长度 6~12任意字符
    function blurPassword(){
        let value = document.getElementById("password").value
        let re = /^.{6,12}$/
        if(re.test(value)){
            console.log("密码没有问题san");
            document.getElementById("password_err").style = "display:none"
            return true
        }else{
            document.getElementById("password_err").style = "display:inline"
            return false
        }

    }
    let PassWord = document.getElementById("password").addEventListener("blur",blurPassword)    
    


    //3. 验证 手机号是否符合规则：长度 11，数字组成，第一位是1
    function blurTel(){
        let value = document.getElementById("tel").value
        let re = /^[1]\d{10}$/
        if(re.test(value)){
            console.log("手机号没有有问题san");
            document.getElementById("tel_err").style = "display:none"
            return true
        }else{
            document.getElementById("tel_err").style = "display:inline"
            return false
        }

    }
    let PhoneNumber = document.getElementById("tel").addEventListener("blur",blurTel)    

    //4. 表单是否可以提交
    function submit(){
        let username = blurUsername()
        let password = blurPassword()
        let PhoneNumber = blurTel()
        if(username&&password&&PhoneNumber){
            alert("提交成功")
            return true
        }else{
            alert("提交失败")
            return false
        }
        // alert("youyouyo")
    }
    document.getElementById("reg-form").addEventListener("submit",submit)
   