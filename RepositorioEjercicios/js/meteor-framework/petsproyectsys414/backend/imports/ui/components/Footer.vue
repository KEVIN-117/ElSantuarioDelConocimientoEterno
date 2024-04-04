<template>
    <div class="set-my-text pb-5 pt-5">
        <div v-if="renderContactFoms" class="container">
            <article class=" pt-5 pb-5 contemntForm set-my-bg-secondary mi-heigth pt-3 d-flex justify-content-center align-items-center" id="Contact">
                <Form/>
            </article>
            <div class="mi-heigth2">
                <div class="mt-4 mb-4 row justify-content-center aling-items-center">
                    <div class="col-md-4">
                        <router-link to="/"><img class="img-fluid" src="/images/Logo.svg" width="200" height="200" alt=""></router-link>
                        <p class="">
                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quo, officiis! Soluta fugit vel magni. Corporis dolorem sed recusandae quidem iusto! Veritatis vitae error praesentium ipsam perspiciatis velit!
                            lorem
                        </p>
                    </div>
                    <div class="col-md-4 d-flex justify-content-center aling-items-center">
                        <div>
                            <h5 class="card-title display-6 set-my-bg my-font-weight set-my-text" >Office</h5>
                        </div>
                        <div>
                            <p class="">
                                Av Tumusla zona ceramica roja calle Sta fe N<sup>O</sup> 2
                            </p>
                        </div>
                        <div>
                            <p class="">
                                Potosi-Bolivia
                            </p>
                        </div>
                        <div>
                            <h5 class="p-gmail set-my-bg">
                                <a href="#">krodriguezcondori34@gmail.com</a>
                            </h5>
                        </div>
                    </div>
                    <div class="col-md-4 d-flex flex-column m-3">
                        <div class="btn-group m-2"  v-for="item in Footer" :key="item">
                            <button type="button" class="text-center set-my-border-radius bg-gradient-primary btn btn-secondary dropdown-toggle" data-toggle="dropdown" data-display="static" aria-expanded="false">
                                {{item.title}}
                            </button>
                            <div class="dropdown-menu set-my-border-radius set-my-bg-secondary dropdown-menu-right bg-gradient-primary">
                                <ul class="text-center dropdown-content" v-for="(it, idx) in item.children" :key="idx">
                                    <li class="text-center bg-gradient-danger">
                                        <button class="text-ceter mt-3 set-my-border-radius dropdown-item bg-gradient-danger" type="button">{{it.title}}</button>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container text-center pt-3 ">
                <p>Copyright Paws and Castles All Rights Reserved 2021.</p>
            </div>
        </div>
        <div v-else>
            <div class="mi-heigth2">
                <div class="mt-4 mb-4 row">
                    <div class="col-md-4 mb-3 mt-3 d-flex flex-column text-center justify-content-center aling-items-center">
                        <div><router-link to="/"><img class="img-fluid" src="/images/Logo.svg" alt=""></router-link></div>
                        <div>
                            <p class="text-center">
                                Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quo, officiis! Soluta fugit vel magni. Corporis dolorem sed recusandae quidem iusto! Veritatis vitae error praesentium ipsam perspiciatis velit!
                                lorem
                            </p>
                        </div>
                    </div>
                    <div class="mt-3 mb-4 col-md-4 d-flex flex-column text-center justify-content-center aling-items-center">
                        <div>
                            <h5 class="text-center card-title display-6 set-my-bg my-font-weight set-my-text" >Office</h5>
                        </div>
                        <div>
                            <p class="text-center">
                                Av Tumusla zona ceramica roja calle Sta fe N<sup>O</sup> 2
                            </p>
                        </div>
                        <div>
                            <p class="text-center">
                                Potosi-Bolivia
                            </p>
                        </div>
                        <div>
                            <h5 class="text-center p-gmail set-my-bg">
                                <a href="#">krodriguezcondori34@gmail.com</a>
                            </h5>
                        </div>
                    </div>
                    <div class="col-md-3 d-flex flex-column m-3">
                        <div class="btn-group m-2"  v-for="item in Footer" :key="item">
                            <button type="button" class="text-center set-my-border-radius bg-gradient-primary btn btn-secondary dropdown-toggle" data-toggle="dropdown" data-display="static" aria-expanded="false">
                                {{item.title}}
                            </button>
                            <div class="dropdown-menu set-my-border-radius set-my-bg-secondary dropdown-menu-right bg-gradient-primary">
                                <ul class="text-center dropdown-content" v-for="(it, idx) in item.children" :key="idx">
                                    <li class="text-center bg-gradient-danger">
                                        <button class="text-ceter mt-3 set-my-border-radius dropdown-item bg-gradient-danger" type="button">{{it.title}}</button>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container text-center pt-3 ">
                <p>Copyright Paws and Castles All Rights Reserved 2021.</p>
            </div>
        </div>
    </div>
</template>
<script>
import Button from './Button.vue'
import Form from './ContactFoms.vue'
export default {
    props:{
        renderContactFoms: Boolean,
    },
    components:{
        Button,
        Form,
    },
    data() {
        return {
            counter : 0,
            Footer:[
                {
                    title:'our company',
                    children:[
                        {
                            title:'Who We Are'
                        },
                        {
                            title:'What We Offer'
                        },
                        {
                            title:'Why Choose Us'
                        },
                        {
                            title:'Location',
                        },
                        {
                            title:'Pet Care Promise',
                        }
                    ]
                },
                {
                    title:'our services',
                    children:[
                        {
                            title:'Pet Grooming',
                        },
                        {
                            title:'Pet Hotel',
                        },
                        {
                            title:'Pet Spa'
                        },
                        {
                            title:'All-in-One-Package',
                        }
                    ]
                },
                {
                    title:'who we are',
                    children:[
                        {
                            title:'The Team',
                        },
                        {
                            title:'Services',
                        },
                        {
                            title:'Sponsors',
                        },
                        {
                            title:'The 1% Mission'
                        }
                    ]
                },
                {
                    title:'legal',
                    children:[
                        {
                            title:'Terms & Conditions',
                        },
                        {
                            title:'Cookie Policy',
                        }
                    ]
                }
            ]
        }
    },
    
}
</script>
<style scoped src="../../assets/css/principal.css">
    /*@import url('https://fonts.googleapis.com/css2?family=Abel&family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap');
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
  
      
    }
     .set-dimension{
        height: 90% !important;
        width: 90%!important;
        box-shadow: 0 0 30px black !important;
        border-radius: 50px !important;
    }
    footer, .contemntForm{
        font-family: var(--my-text) !important;
        border-bottom: 2px solid var(--my-bg) !important;
    }

    footer ul li{
        position: relative ;
        list-style: none !important;
        padding: 0px !important;
        transition: 8s cubic-bezier(0.175, 0.885, 0.32, 1.275);
        transform: translateX(-30px);
    }
    footer .fa-play{
        margin-left: 10px;
        transform: rotate(90deg);
    }

    footer .dropbtn {
        width: max-content;
        background-color: var(--my-bg-cyan);
        color: var(--my-bg-secondary-color);
        border: none;
    }
    footer .dropdown {
        width: 100% !important;
        position: relative;
        margin: 0px !important;
        transition: 3s cubic-bezier(0.175, 0.885, 0.32, 1.275);
    }
    footer .dropdown-content {
        display: none;
        background-color: transparent;
        width: 150%;
        z-index: 100;
        margin-left: 20px;
    }
    footer .dropdown-content a {
        color: var(--my-bg)  !important;
        text-decoration: none;
        display: block;
        padding: 10px !important;
        margin: 0px !important;

    }
    footer .content-dropdown{
        background: transparent;
        position: absolute;
        z-index: 10000;
        top: -10px !important;
    }
    .dropdown:hover{
        transform: translateX(20px);
    }
    .dropdown:hover .fa-play{
        transform: rotate(360deg);
    }
    .dropdown-content a:hover {
        text-shadow:0 0 20px var(--my-bg-primary-color);
        pointer-events: visibleFill !important;
    }
    .dropdown:hover .dropdown-content{
        display: block; 
        padding: 0;
        
        margin-right: 0;
        
    }
    .dropdown:hover .content-dropdown{
        border-radius: 20px !important;
        transform: translateX(110px) translateY(-50px);  
        z-index: 1000;
    }

    footer .inputs{
        width: 50%;
        padding: 0 !important;
        margin: 0 !important;
        background: transparent !important;
        border: none !important;
    }

    footer .btn-send{
        width:15% !important;
        padding: 0 !important;
        margin-left: 70px;
        background: transparent !important;
        border: none !important;
    }

    footer .input-group{
        padding-left: 10px !important;
        padding-bottom: 5px !important;
        border-bottom: 1px solid var(--my-bg) !important;
    }
    footer .inputs:focus {
        outline: none;
    }
    footer .p-gmail a{
        border-bottom: 1px solid var(--my-bg) !important;
        color: var(--my-bg-primary-color) !important;
    }
    footer .sotial-media{
        display: flex;
        align-items: center;
        justify-content: center;
        text-align: center;
        
    }
    footer .sotial-media ul{
        display: flex;
        align-items: center;
        justify-content: center;
        
    }
    footer .sotial-media ul li a{
        width: 100%;
        font-size: 2em !important;
        padding: 5px 10px;
        margin: 20px;
        border-radius: 50% !important;
    }
    footer .fadebook{
        color: #1877f2 !important;
    }
    footer .whatsapp{
        color: #22cf45 !important;
    }
    footer .instagram{
        color: #d6244b;
        
    }
    .text-center{
        display: flex !important;
        justify-content: center !important;
        align-items: center !important;
    } */
</style>