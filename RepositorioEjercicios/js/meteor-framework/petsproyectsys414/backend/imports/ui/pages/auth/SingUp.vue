<template>
    <div class="mi-heigth container bg-cyan set-my-border-radius p-3">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="row justify-content-center">
                    <div class="col-md-12">
                        <h3 class="display-4 text-bold text-center">Bienvenido</h3>
                    </div>
                    <div class="mt-5 col-md-12">
                        <img class="img-fluid" src="/images/SingUp.svg" alt="IMG"/>
                    </div>                
                </div>
            </div>
            <div class="col-md-6">
                <form @submit.prevent="createUserForm" class="" autocomplete="off">
                    <div class="row justify-content-center gap-5">
                        <div class="col-md-9 text-center display-4">
                            Registrate
                        </div>
                        <div class="col-md-9 m-3" >
                            <b-form-input v-model="FormData.username" type="text" class="input100" required name="name" placeholder="Nombres"></b-form-input>                            
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa-solid fa-user" aria-hidden="true"></i>
                            </span>
                        </div>
                        <div class="col-md-9 m-3">
                            <b-form-input v-model="FormData.lastname" type="text" class="input100" required name="lastName" placeholder="Apellidos"></b-form-input>                        
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa-solid fa-user" aria-hidden="true"></i>
                            </span>
                        </div>
                        <div class="col-md-9 m-3" data-validate = "Valid email is required: ex@abc.xyz">
                            <b-form-input v-model="FormData.email" type="email" class="input100" required name="email" placeholder="Email"></b-form-input>        
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-envelope" aria-hidden="true"></i>
                            </span>
                        </div>
                        <div class="col-md-9 m-3">
                            <b-form-input v-model="FormData.phone" class="input100" type="text" required name="phone" placeholder="numero de contacto"></b-form-input>        
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa-solid fa-phone" aria-hidden="true"></i>
                            </span>
                        </div>
                        <div class="col-md-9 m-3" data-validate = "Password is required">
                            <b-form-input v-model="FormData.password" class="input100" type="password" required name="password" placeholder="Contraceña"></b-form-input>        
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-lock" aria-hidden="true"></i>
                            </span>
                        </div>
                        <div class="col-md-9 row justify-content-center m-3">
                            <div class="col-md-12 m-auto "><Button  :title="'crear cuenta'" :desing="'d3'"/></div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        
    </div>
</template>
<script>
import Button from '../../components/Button.vue'
import Vue from 'vue'
export default {
    components:{
        Button,
    },
    data() {
        return {
            FormData:{
                username:null,
                lastname:null,
                email:null,
                phone: null,
                password:null,
            }
        }
    },
    methods: {
        createUserForm(){
            const context = this;
            Meteor.call('createUsers', this.FormData, function(error, result){
                if(error){
                    console.log(error)
                    Vue.swal({
                        icon: 'error',
                        title: 'Oops...',
                        text: error.error.message,
                    });
                }
                else{
                    Meteor.loginWithPassword(result.username, result.password, function(err) {
                        if (err) {
                            console.log(err)
                        }else{
                            Vue.swal({
                                position: 'top-end',
                                icon: 'success',
                                title: 'Tu cuenta a sido creado',
                                showConfirmButton: false,
                                timer: 2500
                            })
                            context.$router.push({ name: 'DashboardHome'})     
                        }
                    });
                }
            });
        }
    },
    computed:{
        UserName(){
            console.log(Meteor.user())
        }
    }  
}
</script>
<style scoped>
    .fa-lock{
        margin-top: 16px;
    }

    /*[ Hover ]
    -----------------------------------------------------------
    */
    .hov-pointer:hover {cursor: pointer;}

    /* ------------------------------------ */
    .hov-img-zoom {
        display: block;
        overflow: hidden;
    }
    .hov-img-zoom img{
        width: 100%;
        -webkit-transition: all 0.6s;
        -o-transition: all 0.6s;
        -moz-transition: all 0.6s;
        transition: all 0.6s;
    }
    .hov-img-zoom:hover img {
        -webkit-transform: scale(1.1);
        -moz-transform: scale(1.1);
        -ms-transform: scale(1.1);
        -o-transform: scale(1.1);
        transform: scale(1.1);
    }
    .flex-w {
        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: flex;
        -webkit-flex-wrap: wrap;
        -moz-flex-wrap: wrap;
        -ms-flex-wrap: wrap;
        -o-flex-wrap: wrap;
        flex-wrap: wrap;
    }

    /*---------------------------------------------*/
    a {
        font-family: Poppins-Regular;
        font-size: 14px;
        line-height: 1.7;
        color: #666666;
        margin: 0px;
        transition: all 0.4s;
        -webkit-transition: all 0.4s;
    -o-transition: all 0.4s;
    -moz-transition: all 0.4s;
    }

    a:focus {
        outline: none !important;
    }

    a:hover {
        text-decoration: none;
        color: var(--my-bg) ;
    }

    /*---------------------------------------------*/
    h1,h2,h3,h4,h5,h6 {
        margin: 0px;
    }

    p {
        font-family: Poppins-Regular;
        font-size: 14px;
        line-height: 1.7;
        color: #666666;
        margin: 0px;
    }

    ul, li {
        margin: 0px;
        list-style-type: none;
    }


    /*---------------------------------------------*/
    input {
        border-radius: 20px !important;
        outline: none;
        border: none;
    }


    textarea:focus, input:focus {
    border-color: transparent !important;
    }

   

    /*---------------------------------------------*/
    button {
        outline: none !important;
        border: none;
        background: transparent;
    }

    button:hover {
        cursor: pointer;
    }
    /*//////////////////////////////////////////////////////////////////
    [ login ]*/

    .limiter {
        width: 100%;
        margin: 0 auto;
    }

    .container-login100 {
        width: 100%;  
        min-height: 50vh;
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        align-items: center;
        padding: 15px;   
        
    }

    .wrap-login100 {
        border-radius: 50px !important;
        width: 80%;
        background: #fff;
        border-radius: 10px;
        overflow: hidden;
        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
        backdrop-filter: blur(20px) !important;
        padding: 50px 130px 33px 95px;
        background-image: radial-gradient(circle, #ede6e1, #e5ddd1, #d8d4c2, #c6cdb5, #b1c7ad, #a5c6b0, #99c5b4, #8dc3ba, #8ec7c6, #91c9d1, #98ccdb, #a1cee4);
    }
    .login100-form-title {
        font-size: 2.5em;
        color: #333333;
        text-transform: uppercase;
        line-height: 1.2;
        text-align: center;
        width: 100%;
        display: block;
        padding-bottom: 54px;
    }
    /*---------------------------------------------*/
    .wrap-input100 {
        position: relative;
        width: 100%;
        z-index: 1;
        margin-bottom: 10px;
        border-radius: 20px !important;
    }

    .input100{
        font-size: 15px;
        line-height: 1.5;
        color: #666666;
        display: block;
        width: 100%;
        background: #e6e6e6 !important;
        height: 50px;
        border-radius: 25px;
        padding: 0 30px 0 68px;
    }
    .input100:focus{
        box-shadow: none;
    }




    .symbol-input100 {
        font-size: 15px;
        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: flex;
        align-items: center;
        position: absolute;
        border-radius: 25px;
        bottom: 0;
        left: 0;
        width: 100%;
        height: 100%;
        padding-left: 35px;
        pointer-events: none;
        color: #666666;
        transition: all 0.4s;
    }

    .input100:focus + .focus-input100 + .symbol-input100 {
        color: #a1cee4;
        padding-left: 28px;
    }


</style>
