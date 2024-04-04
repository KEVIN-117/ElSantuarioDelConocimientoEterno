<template>
    <div>
      <nav class="container-sm navbar navbar-expand-lg navbar-light bg-transparent pt-4 ">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
          <div class="collapse navbar-collapse " id="navbarTogglerDemo01">
            <ul class="navbar-nav mr-auto text-center d-flex justify-content-center">
              <li class="nav-item active mr-4">
                <!-- <a class="nav-link" href="#">HOME</a> -->
                <router-link class="my-a nav-link col-md-12" to="/">HOME</router-link>
              </li>
              <li class="nav-item mr-4">
                <a class="my-a nav-link col-md-12" href="#AboutUs">SOBRE NOSOTROS</a> 
                <!-- <router-link class="my-a nav-link" to="/">SOBRE NOSOTROS</router-link> -->
              </li>
              <li class="nav-item mr-4">
                <a class="my-a nav-link col-md-12" href="#Services">SERVICIOS</a>
              </li>
              <li class="nav-item mr-4">
                <a class="my-a nav-link col-md-12" href="#Location">UBICACIÓN</a>
              </li>
              <li class="nav-item mr-4">
                <a class="my-a nav-link col-md-12" href="#Contact">CONTÁCTENOS</a>
              </li>
            </ul>
            <ul class="d-flex justify-content-center">
              <li class="nav-item">
                  <!-- <a class="nav-link" href="#">LOG IN</a> -->
                <router-link v-if="!check" class="my-a nav-link col-md-12 " :to="{ name: 'register'}">CREAR CUENTA</router-link>
              </li>
                <li class="nav-item">
                  <!-- <a class="nav-link" href="#">LOG IN</a> -->
                  <router-link v-if="!check" class="my-a nav-link col-md-12" :to="{ name: 'login'}">INICIAR SESIÓN</router-link>
                </li>
                <li class="nav-item">
                  <router-link v-if="check" class=" nav-link" :to="{ name: 'DashboardHome'}"><Button :desing="'d1'" :title="'DASHBOARD'"/></router-link>
                </li>
            </ul>
          </div>
          
      </nav>
    </div>
</template>
<script>
import Button from './Button.vue';
import { Meteor } from 'meteor/meteor';
export default {
    components: { 
      Button,
    },
    data() {
        return {
          checkRender: true,
        }
    },
    computed:{
      check(){
        const isAuthenticated = Meteor.userId()
        if (!isAuthenticated){
          this.checkRender = false
        }else{
          this.checkRender = true
        }
        return this.checkRender;
      },
    },
}
</script>
<style scoped src="../../assets/css/principal.css">
  /* nav ul li .my-a::before{
    content: '' !important;
    position: absolute !important;
    left: 0 !important;
    top: 0 !important;
    width: 0 !important;
    height: 100% !important;
    background: var(--my-bg-cyan);
    transform: translateX(0) !important;
    z-index: -1;
    overflow: hidden;
    backdrop-filter: blur(15px);
  }
  nav ul li .my-a:hover::before{
    content: '' !important;
    transition: 2s cubic-bezier(0.075, 0.82, 0.165, 1);
    width: 100% !important;
    height: 100% !important;
    border-radius: 20px;
    box-shadow: 0 0 20px var(--my-bg-cyan) !important;
    opacity: 0.5;
  } */
</style>