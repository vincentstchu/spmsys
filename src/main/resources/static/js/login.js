var app_login = new Vue({
    el: '#app_login',
    data: {
        // message: 'Hello Vue.js!',
        inputtext:{
            username: null,
            password: null
        }
    },
    methods: {
        onSubmit: function () {
            axios({

                method: 'post',
                // url: 'http://120.78.135.143/spmsys-0.0.1-SNAPSHOT/login/researchers',
                url: 'http://localhost:8080/login/researchers',
                data: {
                    id : null,
                    name : this.inputtext.username,
                    passwd : this.inputtext.password,
                    regtime : null
                },
                // transformRequest: [function (data) {
                //   // Do whatever you want to transform the data
                //   let ret = ''
                //   for (let it in data) {
                //     ret += encodeURIComponent(it) + '=' + encodeURIComponent(data[it]) + '&'
                //   }
                //   return ret
                // }],
                // headers: {
                //   'Content-Type': 'application/x-www-form-urlencoded'
                // }

            }).then(function (response) {
                console.log(response.data);
            })
                .catch(function (error) {
                    console.log(error);
                }),
                console.log("username:" + this.inputtext.username + " password:" + this.inputtext.password),
                console.log(this.inputtext)
        }
    }
})