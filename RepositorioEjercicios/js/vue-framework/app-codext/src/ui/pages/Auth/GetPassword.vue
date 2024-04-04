<template>
    <div class="set-my-heigth p-5 set-bg-animations-shape ">
        <div class="container">
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
                                <div class="col-md-12 mb-3">
                                    <div class="input-group mb-3 rounded set-glass-efect p-2">
                                        <span class="input-group-text inputSpan ms-4" id="basic-addon1"><i class="fa-solid fa-user"></i></span>
                                        <input type="text" v-model="form.email" class="input ms-2" placeholder="Email Address" aria-label="email" aria-describedby="basic-addon1">
                                    </div>
                                </div>
                                
                                <div class="col-md-12 d-flex justify-content-center">
                                    <BTN @click="handleSubmit" :title="'create your account'" :state="5" :buttonBg="'#00a9ff'"/>
                                </div> 
                            </div>
                            
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import BTN from '../../../components/ButtonVue.vue'
export default {
    components:{
        BTN,
    },
    data() {
        return {
            form:{
                email: ''
            }
        }
    },
    methods: {
        handleSubmit(){
            console.log(this.form)
            return this.form
        }
    },
}
</script>
<style>
    
</style>