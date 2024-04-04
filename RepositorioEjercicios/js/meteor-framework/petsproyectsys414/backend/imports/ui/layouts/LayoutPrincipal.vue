<template>
    <div class="mi-heigth set-background-gradient">
      <header class="" v-if="checkLocation" id="principal">
        <NavBar/>
        <section class="container overflow-hidden mi-heigth linesSvg bg-img mt-5 " >
            <div class="row justyfi-content-center">
                <div class="col-md-4">
                    <h2 class="text-uppercase display-4">The</h2>
                    <h1 class="text-uppercase display-1 set-my-text font-weight-bold">paw castle</h1>
                    <p class="mr-3 pr-5 set-my-text-two">Your pets deserve the most luxuriouslove and care.</p>
                </div>
                <div class="col-md-4">
                    <img class="img-fluid" src="/images/Cat.png" alt="" >
                </div>
                <div class="col-md-4 container row set-my-border-radius border-primary">
                    <div class="col-md-12">
                        <p class="p-2 text-center set-my-text-two">
                            Pets and Castles is a one-stop shop for all your pets’ needs and a hotel for whenever you need to be somewhere but still want to provide the best care and love for your fur babies. Visit us today or schedule a call!
                        </p>
                    </div>
                    <div class="col-md-12 justify-content-center">
                        <div>
                          <Button class="mt-2" :desing="'d1'" :title="'INICIAR AHORA'"/>
                        </div>
                    </div>
                </div>
            </div>
        </section>
      </header>
      <header v-else class="bg-img mi-heigth"> 
        <NavBar/>
      </header>
      <main :class="!checkLocation? 'mi-heigth':''">
        <router-view></router-view>
      </main>
      <footer class="mi-heigth2 bg-cyan">
          <div class="container"><Footer :renderContactFoms='false' id="Location"/></div>
      </footer>
    </div>
</template>
  
<script>
  import NavBar from '../components/NavBar.vue'
  import Button from '../components/Button.vue'
  import Card from '../components/Card.vue'
  import CardGroup from '../components/CardGroup.vue'
  import ImgR_L from '../components/ImgR_L.vue'
  import TitleS from '../components/TitleContent.vue'
  import Testimonials from '../components/ContentTestimonials.vue'
  import Footer from '../components/Footer.vue'
  import My_SVG from '../components/SvgCircles.vue'
  export default {
    components: {
      NavBar,
      Button,
      Card,
      CardGroup,
      ImgR_L,
      TitleS,
      Testimonials,
      Footer,
      My_SVG,
    },
    data() {
      return {
        checkRender: true,
      }
    },
    watch:{
      
    },
    methods: {
      
    },
    computed:{
      checkLocation(){
        if(this.$route.name != 'principal'){
          this.checkRender = false;
        }else{
          this.checkRender = true;
        }
        return this.checkRender;
      }
    },
    mounted() {
      document.getElementById('materialOne')?.remove();
      document.getElementById('materialTwo')?.remove();
      require('bootstrap/dist/css/bootstrap.css'),
      require('bootstrap-vue/dist/bootstrap-vue.css')
      
    },
  }
</script>
  
<style scoped src="../../assets/css/principal.css">
    /* @import url('https://fonts.googleapis.com/css2?family=Abel&family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap');
    @import url('https://fonts.googleapis.com/css2?family=Abel&family=Arimo:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap');
  
    :root{
      --my-bg-primary-color: #30302f;
      --my-bg: #ede6e1;
      --my-bg-secondary-color: #d25207;
      
      --my-bg-white: #ede6e1;
      --my-bg-cyan: #91bea9;
      --my-bg-tree:#a1cee4;
      --my-text:'Abel';
      --my-text-two:'Arimo';
  
      
    } */
    
   /* .prim{
      overflow-x: hidden;
    }
    .set-my-bg-primary{
      color: var(--my-bg-primary-color) !important;
    }
    body {
      font-family: 'Open Sans', sans-serif;
    }
    *{
      border-radius: 0px !important;
    }
    header#principal{
      background:url('/images/Background.svg'), url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' version='1.1' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns:svgjs='http://svgjs.com/svgjs' width='1440' height='560' preserveAspectRatio='none' viewBox='0 0 1440 560'%3e%3cg mask='url(%26quot%3b%23SvgjsMask1046%26quot%3b)' fill='none'%3e%3cpath d='M-50.05 155.66C63.29 155.87 173.9 225.66 397.86 225.66 621.81 225.66 600.87 146.84 845.76 155.66 1090.66 164.48 1136.73 583.69 1293.67 623.61' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M-25.59 125.77C111.67 126.56 217.56 238.84 509.45 248.97 801.33 259.1 885.92 579.95 1044.48 594.54' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M-193.22 194.77C-50.67 198.39 52.22 394.24 338.21 401.97 624.19 409.7 726.19 614.75 869.63 618.87' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M-92.09 422.71C10.37 422.97 109.82 492.71 311.74 492.71 513.65 492.71 511.77 422.45 715.56 422.71 919.36 422.97 1008.88 599.18 1119.39 603.23' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M-76.76 118.85C54.93 121.08 195.87 262.11 422.57 286.85 649.28 311.59 572.87 597.16 672.24 639.54' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3c/g%3e%3cdefs%3e%3cmask id='SvgjsMask1046'%3e%3crect width='1440' height='560' fill='white'%3e%3c/rect%3e%3c/mask%3e%3c/defs%3e%3c/svg%3e")  var(--my-bg) !important;
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-position: center; 
      height: 100vh;
    }
    
    nav a{
      color: var(--my-bg-secondary-color) !important;
      font-weight: 500;
      font-family: var(--my-text-two);
    }
    .background{
      background: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' version='1.1' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns:svgjs='http://svgjs.com/svgjs' width='1440' height='560' preserveAspectRatio='none' viewBox='0 0 1440 560'%3e%3cg mask='url(%26quot%3b%23SvgjsMask1046%26quot%3b)' fill='none'%3e%3cpath d='M-50.05 155.66C63.29 155.87 173.9 225.66 397.86 225.66 621.81 225.66 600.87 146.84 845.76 155.66 1090.66 164.48 1136.73 583.69 1293.67 623.61' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M-25.59 125.77C111.67 126.56 217.56 238.84 509.45 248.97 801.33 259.1 885.92 579.95 1044.48 594.54' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M-193.22 194.77C-50.67 198.39 52.22 394.24 338.21 401.97 624.19 409.7 726.19 614.75 869.63 618.87' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M-92.09 422.71C10.37 422.97 109.82 492.71 311.74 492.71 513.65 492.71 511.77 422.45 715.56 422.71 919.36 422.97 1008.88 599.18 1119.39 603.23' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M-76.76 118.85C54.93 121.08 195.87 262.11 422.57 286.85 649.28 311.59 572.87 597.16 672.24 639.54' stroke='rgba(145%2c 190%2c 169%2c 1)' stroke-width='2'%3e%3c/path%3e%3c/g%3e%3cdefs%3e%3cmask id='SvgjsMask1046'%3e%3crect width='1440' height='560' fill='white'%3e%3c/rect%3e%3c/mask%3e%3c/defs%3e%3c/svg%3e"), var(--my-bg) !important;
      background-repeat: no-repeat !important;
    }
    .set-background-gradient{
      background-image: radial-gradient(circle, #ede6e1, #e1dacc, #e1dacc, #e1dacc, #e1dacc, #91bea9);
    }
    .bg-cyan{
      background-color: var(--my-bg-cyan) !important;
    }
    .bg-img{
      background: url('/images/blob.svg') !important;
      background-position: center !important;
      background-repeat: no-repeat !important;
      background-size: 500px !important; 
      
      object-fit: cover;
      overflow: visible !important;
    }
    .bg-img2{
      background-color: var(--my-bg-tree) !important;
    }
    .my-paddings{
      padding-left: 0 !important;
      padding-right: 0 !important;
    }
    .set-my-text{
      font-family: var(--my-text) !important;
    }
    .set-my-text-two{
      font-family: var(--my-text-two) !important;
    }
    .my-h6{
      font-size: 12px !important;
    }
    .border-primary{
      border: var(--my-bg-secondary-color) 2px solid !important;
    }
    .my-width{
      width: 100% !important;
    }
    .mi-heigth{
      height: 100vh !important;
    }
    .mi-heigth2{
      height: auto !important;
    }
    .set-my-bg{
      color: var(--my-bg) !important;
    }
    .set-my-bg-secondary{
      background:url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' version='1.1' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns:svgjs='http://svgjs.com/svgjs' width='1440' height='800' preserveAspectRatio='none' viewBox='0 0 1440 800'%3e%3cg mask='url(%26quot%3b%23SvgjsMask1227%26quot%3b)' fill='none'%3e%3cpath d='M1601.26 651.17C1467.66 648.67 1413.08 519.45 1096.59 475.17 780.09 430.89 779.65-71.54 591.91-133.25' stroke='rgba(237%2c 230%2c 225%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M1610.04 244.65C1453.41 249.85 1263.73 497.34 1034.31 492.65 804.89 487.96 876.72 21.65 746.44-66.28' stroke='rgba(237%2c 230%2c 225%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M1596.75 82.99C1454.13 89.35 1345.01 332.11 1082.36 330.99 819.7 329.87 737.67-98.08 567.96-130.13' stroke='rgba(237%2c 230%2c 225%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M1651.24 497.73C1490.43 503.16 1314.56 770.68 1060.73 753.73 806.91 736.78 912.26 137.24 765.48-3.15' stroke='rgba(237%2c 230%2c 225%2c 1)' stroke-width='2'%3e%3c/path%3e%3cpath d='M1692.54 275.6C1500.44 283.08 1350.64 597.21 993.29 595.6 635.94 593.99 523.19 21.68 294.04-20.04' stroke='rgba(237%2c 230%2c 225%2c 1)' stroke-width='2'%3e%3c/path%3e%3c/g%3e%3cdefs%3e%3cmask id='SvgjsMask1227'%3e%3crect width='1440' height='800' fill='white'%3e%3c/rect%3e%3c/mask%3e%3c/defs%3e%3c/svg%3e"), var(--my-bg-cyan) !important;

    }
    .set-my-color-secondary{
      color: var(--my-bg-cyan) !important;
    }
    .set-bg-text{
      background: var(--my-bg-primary-color) !important;
    }
    .set-text-spacing{
      letter-spacing: 9px !important;
    }
    .hoverP:hover{
      border-bottom: 1px solid var(--my-bg-primary-color)  !important;
    }
    .hoverA:hover{
      border-bottom: none  !important;
    }  
  
    .set-my-border-radius{
      border-radius: 20px !important;
    }
    .animation{
      position: relative !important;
      overflow: hidden;
    }    
    .contentForm-border{
      border-bottom: 2px solid var(--my-bg) !important;
    } */
</style>
  
<!-- <template>
    <div>
        <h1>this is my super layout</h1>  
        <center>
            <router-link to="/page-one">page-one</router-link>
            <router-link to="/page-two">page-two</router-link>
        </center>
        <br>
        <br>
        <router-view/>
    </div>
</template>
<script>
export default {
    
}
</script>
<style>
    
</style> -->