<template>
    <div>
        <article class="overflow-hidden set-my-bg-secondary pb-4 pt-4" id="AboutUs">
          <div class="container pt-4 pb-4">
            <div class="row justify-content-center set-my-text-two">
              <div class="set-my-border-radius col-md-4 align-self-center pt-3 pb-3 mt-5 text-center set-bg-text set-my-color-secondary">
                QUIENES SOMOS COMO EMPRESA
              </div>
              <div class="titles mt-5 set-my-text display-3 set-my-bg font-weight-bold text-center ">
                Aspiramos a brindarle a sus mascotas el mejor cuidado
              </div>
              <div class="col-md-9 mt-5 mb-2 text-center set-my-text-two ">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna 
                aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
                Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sin
                t occaecat cupidatat non proident, sunt in culpa qui officia
                deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem.
              </div>
            </div>
          </div>
        </article>
  
        <article class="mi-heigth background">
            <div class="container">
                <div class="">
                  <ImgR_L :lefth="true" 
                    :img="'/images/Cat2.png'" 
                    :title="'HOTEL PARA MASCOTAS Y PELUQUERÍA'" 
                    :description="'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate. velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sintoccaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum  '"/>
                </div>
            </div>
        </article>
  
        <article class="pt-5 pb-5 mi-heigth set-my-bg-secondary">

          <div class="container">
              <div class="">
                <TitleS :pading="true" :fontSize=4 :fontWeight=600 :content="'¿POR QUÉ ELEGIRNOS?'"/>
              </div>
              <div  class="row gap-2 ">
                <div class="col-md-4">
                  <Card 
                    :title="'01'" 
                    :smallTitle="'CUIDADO DE MASCOTAS'" 
                    :description="'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.ex '"
                  />
                </div>
                <div class="col-md-4">
                  <Card 
                    :title="'02'" 
                    :smallTitle="'DE PRIMERA CALIDAD'" 
                    :description="'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.ex '"
                  />
                </div>
                <div class="col-md-4">
                  <Card 
                    :title="'03'" 
                    :smallTitle="'TUS MASCOTAS DESINFECTADAS'" 
                    :description="'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.ex '"
                  />
                </div>  
              </div>
          </div>
        </article>
        <article class="mi-heigth2 background pt-5 pb-5" id="Services">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <TitleS :pading="true" :fontSize=4 :fontWeight=600 :content="'nuestros servicios'"/>
                    </div>
                    <div class="col-md-12 d-flex justify-content-center aling-items-center w-100 m-auto set-my-border-radius">
                      <CardGroup 
                        class="CardGroup"
                      />
                    </div>
                  </div>
            </div>
        </article>
  
        <article class="mi-heigth2 set-my-bg-secondary pt-5 pb-5">
          <div class="container">
              <div class="row" >
                  <div class="col-md-6 set-my-border-radius text-justify">
                      <ImgR_L :lefth="false" :title="'FAQs'"/>
                  </div>
                  <div class="mt-5 col-md-6 set-my-border-radius d-flex justify-content-center align-items-center background-grid2">
                      <div class="card set-my-border-radius set-my-bg-Img-R">
                          <img class="set-my-border-radius" src="/images/IMGR_L.svg" alt="Card image cap">
                      </div>
                  </div>
              </div>
          </div>
        </article>
        <article class="mi-heigth2 background position-relative pt-5 pb-5">
          
          <TitleS :pading="true" :fontSize=3 :fontWeight=600 :content="'testimonials'"/>
          <div class="container">
            <div class="row">
                <div class="col-md-6">
                      <Testimonials 
                        :testimony="'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.'"
                        :author="'— JEANNE LIM'"
                      />
                </div>
                <div class="col-md-6">
                      <Testimonials 
                        :testimony="'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.'"
                        :author="'— JEANNE LIM'"
                      />
                </div>
                <div class="col-md-6">
                      <Testimonials 
                        :testimony="'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.'"
                        :author="'— JEANNE LIM'"
                      />
                    </div>
                    <div class="col-md-6">
                      <Testimonials 
                        :testimony="'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.'"
                        :author="'— JEANNE LIM'"
                      />
                    </div>
              </div>
          </div>
        </article>
        <article class="contentForm-border set-my-bg-secondary mi-heigth pt-3 d-flex justify-content-center align-items-center" id="Contact" >
                <FormContact />
        </article>
    </div>
</template>
<script>
    import Button from '../../components/Button.vue'
    import Card from '../../components/Card.vue'
    import CardGroup from '../../components/CardGroup.vue'
    import ImgR_L from '../../components/ImgR_L.vue'
    import TitleS from '../../components/TitleContent.vue'
    import Testimonials from '../../components/ContentTestimonials.vue'
    import My_SVG from '../../components/SvgCircles.vue'
    import FormContact from '../../components/ContactFoms.vue'
    export default {
        components:{
            Button,
            Card,
            CardGroup,
            ImgR_L,
            TitleS,
            Testimonials,
            My_SVG,
            FormContact
        }
    }
</script>
<style scoped src="../../../assets/css/principal.css">
    
</style>