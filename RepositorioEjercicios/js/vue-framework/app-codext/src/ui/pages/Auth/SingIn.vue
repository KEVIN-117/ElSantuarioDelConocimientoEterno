<template>
    <div class="set-my-heigth p-5 set-bg-animations-shape ">
        <div class="row set-glass-efect pt-5 pb-5 justify-content-center align-items-center">
            <div class="col-md-6">
                <img src="../../../assets/img/HomeImg.svg" class="" alt="">
                <h1 class="m-0 codext set-my-font-family-two fst-italic text-center">Codex</h1>
                <p class="m-0 codext set-my-font-family-two fst-italic text-center">codex says welcome back user</p>
            </div>
            <div class="col-md-6 pt-5">
                <form action="" @submit.prevent="handleSubmit" autocomplete="off">
                    <div class="row justify-content-center">
                        <div class="col-md-12 row">
                            <div class="col-md-12 mb-3">
                                <div class="input-group mb-3 rounded set-glass-efect p-2">
                                    <span class="input-group-text inputSpan ms-4" id="basic-addon1"><i class="fa-solid fa-user"></i></span>
                                    <input type="text" class="input ms-2" placeholder="User name or Email Address" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                            </div>


                            <div class="col-md-12 mb-3">
                                <div class="input-group mb-3 rounded set-glass-efect p-2">
                                    <span class="input-group-text inputSpan ms-4" id="basic-addon1"><i class="fa-solid fa-lock"></i></span>
                                    <input type="password" class="input ms-2" placeholder="Password" aria-label="Password" aria-describedby="basic-addon1">
                                </div>
                            </div>

                            <div class="col-md-12 d-flex justify-content-center">
                                <BTN :title="'Sing In'" :state="5" :buttonBg="'#00a9ff'"/>
                            </div>

                            <div class="col-md-12 d-flex justify-content-center fw-bold fs-3 text-sky-500 align-items-center mt-4 mb-4">
                               <hr class="w-25" style="height: 3px;"> <span class="ms-5 me-5">or</span> <hr class="w-25" style="height: 3px;">
                            </div>

                            <div class="col-md-12 mt-2 mb-2 d-flex justify-content-center">
                                <BTN :title="'continue with facebook'" :icon="'fa-brands fa-facebook'" :state="6" :buttonBg="'#1f4393'"/>
                            </div>

                            <div class="col-md-12 mt-2 mb-2 d-flex justify-content-around">
                                <BTN :title="'continue with twitter'" :icon="'fa-brands fa-twitter'" :state="6" :buttonBg="'#42aeec'"/>
                            </div>
                            <div class="col-md-12 d-flex justify-content-center fw-bold text-sky-500 align-items-center mt-4 mb-4">
                                <span class="ms-5 me-5">
                                    New User to codex <router-link class="fs-5" :to="{name: 'SingUp'}">SingUp?</router-link>
                                </span>
                                <span class="ms-5 me-5">
                                    Forgot to <router-link class="fs-5" :to="{name: 'ForgotPassword'}">Password?</router-link>
                                </span>
                            </div>
                        </div>
                        
                    </div>
                </form>
            </div>
        </div>
    </div>
</template>
<script >
    import BTN from '../../../components/ButtonVue.vue'
    export default {
        name:'SingIn',
        components:{
            BTN,
        },
        data() {
            return {
                CountryCode:[
                    {
                        value:1,
                        code: '+591'
                    },
                    {
                        value:2,
                        code: '+10'
                    },
                    {
                        value:3,
                        code: '+15'
                    },
                    {
                        value:4,
                        code: '+18'
                    }
                ],
                ListJob:[
                    {
                        value:1,
                        job:"Designer"
                    },
                    {
                        value:2,
                        job:"Developer"
                    },
                    {
                        value:3,
                        job:"Manager"
                    },
                    {
                        value:4,
                        job:"Accountant"
                    },
                ]
            }
        },
    }
</script>
<style>
    .input{
        border: none !important;
        background: transparent;
        outline: none;
    }
    .input:focus{
        border: none !important;
        background: transparent;
        font-family: var(--set-my-font-family-two);
    }
    input:focus{
        border: none !important;
        outline: none !important;
        box-shadow: none !important;
        font-family: var(--set-my-font-family-two);
        color: #00a9ff;
    }
    .inputSpan{
        border: none !important;
        background: transparent;
    }

    input::-webkit-input-placeholder {
        padding-left: 5px;
        line-height: 100px;
        letter-spacing: 2px;
        color: #00a9ff;
    }
    input:focus + inputSpan{
        margin-left: 0 !important;
        font-family: var(--set-my-font-family-two);
    }

    .inputMail{
        width: 80% !important;
    }
    input[type=number]::-webkit-inner-spin-button, input[type=number]::-webkit-outer-spin-button {
        -webkit-appearance: none;
        margin: 0;
    }

    .formSelect{
        padding: 0 !important;
        background: transparent !important;
        border: none !important;
    }
    .formSelect:focus{
        border: none !important;
        outline: none !important;
        box-shadow: none !important;
        font-family: var(--set-my-font-family-two);
    }
    select option{
        background: transparent !important;
        color: #00a9ff;
    }
</style>