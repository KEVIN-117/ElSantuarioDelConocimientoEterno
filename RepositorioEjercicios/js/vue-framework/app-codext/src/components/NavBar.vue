<template>
    <div>
        <nav class="eventNav navbar navbar-expand-lg ">
            <div class="container-fluid">
                <div class="cursor navbar-brand pr-5 d-flex justify-content-center align-items-center position-relative">
                    <img class="img-fluid m-0" width="100" height="100" src="../assets/img/HomeImg.svg" alt=""> 
                    <span class="m-0 position-absolute codext set-my-font-family-two fst-italic">Codex</span>
                </div>
                <ButtonVue @click="eventClick" :state="3" :title="'navbar-toggler-icon'" class="navbar-toggler p-1 fs-5" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    
                </ButtonVue>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav m-auto ">
                        <!-- <li class="nav-item nav__item">
                            <a class="nav-link text-capitalize fw-bold set-my-font-family-one" aria-current="page" href="#">{{item}}</a>
                        </li> -->
                    </ul>
                    <ul class="d-flex gap-2 justify-content-center w-100 navbar-nav m-auto mb-2 mb-lg-0" >
                        <li class="nav-item nav__item " v-for="item in navItems" :key="item">
                            <router-link class="nav-link text-uppercase set-my-font-family-two" :to="{name: item}">{{item}}</router-link>
                        </li>
                        <li class="nav-item d-flex justify-content-center">
                            <router-link :to="{name: 'SingIn'}">
                                <ButtonVue :title="'Sing In'" :state="1" :buttonBg="'#00a9ff'"/>
                            </router-link>
                        </li>
                        <li class="nav-item d-flex justify-content-center">
                            <router-link :to="{name: 'SingUp'}">
                                <ButtonVue :title="'Sing up'" :state="1" :buttonBg="'#00a9ff'"/>
                            </router-link>
                        </li>
                    </ul>
                        
                </div>
            </div>
        </nav>
    </div>
</template>
<script>
import ButtonVue from './ButtonVue.vue'
export default {
    props: {
        navItems: Array
    },
    components:{
        ButtonVue
    },
    methods:{
        eventClick(){
            let eventNav = document.querySelector('.eventNav')
            eventNav.classList.add('set-glass-efect', 'h-75', 'pb-5')
            document.querySelector('.eventNav').classList.toggle('active')
            eventNav.classList.remove('set-glass-efect', 'h-75', 'pb-5')
            eventNav.classList.add('set-bg')
        },
    }
}
</script>
<style scoped>
    ul .nav__item a{
        display: flex;
        width: auto !important;
        justify-content: center;
        color: white;
        position: relative
        
    }
    .nav__item a::after{
        content: "";
        position: absolute;
        display: flex;
        justify-content: center;
        width: 0%;
        top: 70%;
        height: 0.3rem;
        transition: 2s cubic-bezier(0.55, 0.055, 0.675, 0.19);
        border-radius: 50% ;
    }
    .eventNav.active{
        clip-path: circle(140% at 95.3% 8.5%);
    }
    .nav__item:hover a::after{
        width: 100%;
        transition: 0.3s cubic-bezier(0.55, 0.055, 0.675, 0.19);
        background-image: radial-gradient(circle, #00a9ff,#ff000000);
        box-shadow: 30px #0079e3 ;
        background-position: center;
        background-size: 100%;
        background-repeat: no-repeat;
    }
    .nav__item:hover a{
        transition: 0.9s cubic-bezier(0.55, 0.055, 0.675, 0.19);
        
    }
    .codext{
        color: #00a9ff;
        font-weight: bold;
        
    }
    .cursor{
        cursor: none;
    }
    .set-bg{
        background: transparent;
    }

</style>