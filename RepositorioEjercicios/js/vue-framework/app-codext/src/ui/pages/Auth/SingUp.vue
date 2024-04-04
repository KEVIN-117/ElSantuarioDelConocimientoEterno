<template>
    <div class="set-my-heigth p-5 set-bg-animations-shape ">
        <div class="row set-glass-efect pt-5 pb-5 justify-content-center align-items-center">
            <div class="col-md-6">
                <img src="../../../assets/img/HomeImg.svg" class="" alt="">
                <h1 class="m-0 codext set-my-font-family-two fst-italic text-center">Codex</h1>
                <p class="m-0 codext set-my-font-family-two fst-italic text-center">Create an account</p>
            </div>
            <div class="col-md-6 pt-5">
                <form action="" @submit.prevent="handleSubmit" autocomplete="off">
                    <div class="row justify-content-center">
                        <div class="col-md-12 row">
                            <div class="col-md-6 mb-3">
                                <div class="input-group mb-3 rounded set-glass-efect p-2">
                                    <span class="input-group-text inputSpan ms-4" id="basic-addon1"><i class="fa-solid fa-user"></i></span>
                                    <input type="text" v-model="form.name" class="input ms-2" placeholder="First Name" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <div class="input-group mb-3 rounded set-glass-efect p-2">
                                    <span class="input-group-text inputSpan ms-4" id="basic-addon1"><i class="fa-solid fa-user"></i></span>
                                    <input type="text" v-model="form.lastName" class="input ms-2" placeholder="Last Name" aria-label="UserLastName" aria-describedby="basic-addon1">
                                </div>
                            </div>
                            <div class="col-md-12 mb-3">
                                <div class="input-group mb-3 rounded set-glass-efect p-2">
                                    <span class="input-group-text inputSpan ms-4" id="basic-addon1"><i class="fa-solid fa-envelope"></i></span>
                                    <input type="email" v-model="form.email" class="input inputMail ms-2" placeholder="Email Address" aria-label="email" aria-describedby="basic-addon1">
                                </div>
                            </div>

                            <div class="col-md-12 mb-3">
                                <div class="input-group mb-3 rounded set-glass-efect p-2">
                                    <span class="input-group-text formSelect ms-4" style="border-right: 1px solid black;" id="basic-addon1">
                                        <i class="fa-solid fa-phone"></i>
                                        <select class="form-select ms-3 formSelect" id="inputGroupSelect01"  style="color: #00a9ff;">
                                            <option v-for="(item, index) in CountryCode" :key="index" :value="item.value">{{ item.code }}</option>
                                        </select>
                                    </span>
                                    <input type="number" v-model="form.phoneNumber" class="input ms-2" placeholder="Phone Number" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                            </div>
                            <div class="col-md-12 mb-3">
                                <div class="input-group mb-3 set-glass-efect p-3 ps-4">
                                    <label class="input-group-text formSelect ms-3" for="inputGroupSelect01"><i class="fa-solid fa-user-doctor"></i></label>
                                    <select class="form-select formSelect ms-5" id="inputGroupSelect01" style="color: #00a9ff;">
                                        <option v-for="(item, index) in ListJob" :key="index" :value="item.value">{{ item.job }}</option>
                                    </select>
                                </div>
                            </div>


                            <div class="col-md-6 mb-3">
                                <div class="input-group mb-3 rounded set-glass-efect p-2">
                                    <span class="input-group-text inputSpan ms-4" id="basic-addon1"><i class="fa-solid fa-lock"></i></span>
                                    <input type="password" v-model="form.password" class="input ms-2" placeholder="Password" aria-label="Password" aria-describedby="basic-addon1">
                                </div>
                            </div>


                            <div class="col-md-6 mb-3">
                                <div class="input-group mb-3 rounded set-glass-efect p-2">
                                    <span class="input-group-text inputSpan ms-4" id="basic-addon1"><i class="fa-solid fa-lock"></i></span>
                                    <input type="password" v-model="form.confirmPassword" class="input ms-2" placeholder="Confirm Password" aria-label="Password" aria-describedby="basic-addon1">
                                </div>
                            </div>

                            <div class="col-md-12 d-flex justify-content-center">
                                <BTN @click="createUserForm" :title="'create your account'" :state="5" :buttonBg="'#00a9ff'"/>
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
                                    Already Registered <router-link class="fs-5" :to="{name: 'SingIn'}">Login?</router-link>
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
        name:'SingUp',
        components:{
            BTN,
        },
        data() {
            return {
                form: {
                    name:'',
                    lastName: '',
                    email: '',
                    countryCode: '',
                    phoneNumber: '',
                    job: '',
                    password: '',
                    confirmPassword: '',
                },
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
        methods: {
            createUserForm(){
                console.log(this.form)
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
    }
    input:focus{
        border: none !important;
        outline: none !important;
        box-shadow: none !important;
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
    }
    select option{
        background: transparent !important;
        color: #00a9ff;
    }
</style>