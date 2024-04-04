<template>
    <div>
        <!-- aqui ira las etiquetas nav main footer -->
        <header class="set-bg-animations-shape set-my-heigth  set-header-bg" v-if="checkLocation" id="NavSection">
            <div class="container">
                <Nav :navItems="['Home', 'OperatingSystem', 'services', 'membership', 'testimonial', 'teams']"/>
            <!-- , ['testimonials', 'testimonials'], ['blog', 'blog'] -->
            <div class="pt-5 pb-5">
                    <div class="container">
                        <NavSection/>
                    </div>
                </div>
            </div>
        </header>
        <header class="set-bg-animations-shape set-my-heigth  set-header-bg" v-else id="NavSection">
            <div class="container">
                <Nav :navItems="['Home', 'OperatingSystem', 'services', 'membership', 'testimonial', 'teams']"/>
            </div>
        </header>
        <main :class="!checkLocation? 'set-my-heigth':''">
            <router-view></router-view>
        </main>
        <footer class="set-my-heigth set-footer-bg text-center">
            <div class="set-glass-efect pt-5 pb-5">
                <div class="container-fluid">
                    <div class="row justify-content-center align-items-center p-2">
                        <div class="col-md-4 pb-5 pt-4 justify-content-center">
                            <div class="d-flex flex-column justify-content-center align-items-center position-relative">
                                <img class="img-fluid m-0" src="../../assets/img/HomeImg.svg" alt=""> 
                                <div class="codext set-my-font-family-two fs-1 fst-italic">Codex</div>
                            </div>
                            <div class="text-center set-my-color-text-background set-my-font-family-two">
                                Lorem ipsum dolor, sit amet consectetur adipisicing elit. Perspiciatis quia fugiat qui dicta numquam dolorum distinctio, tempore repellendus eveniet vero odio iste velit excepturi neque culpa non corporis rem nesciunt!
                            </div>
                            <ul class="d-flex justify-content-between align-items-center mt-3" >
                                <li class="list-group-item" v-for="(item, index) in media" :key="index">
                                    <a :href="item.href"><i :class="item.icon"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="col-md-3 pb-5 pt-4 set-my-color-text-background " v-for="(item, indexOne) in Footer" :key="indexOne">
                            <h1 class="mb-5">{{ item.title }}</h1>
                            <ul class="" v-for="(itemChild, index) in item.children" :key="index">
                                <li class="mb-4 list-group-item">{{ itemChild.title }}</li>
                            </ul>
                            <nav v-if="indexOne+1 == Footer.length" class="mb-4 navbar rounded-start d-flex justify-content-center w-100">
                                <form @submit.prevent="sendMail" class="d-flex rounded set-my-form-border overflow-hidden">
                                    <input class="set-outline bg-transparent " type="email" placeholder="Email address" aria-label="Search">
                                    <myButton :title="'send'" :state="4" :buttonBg="'#00a9ff'"/>
                                </form>
                            </nav>
                        </div>
                        
                    </div>
                    <div class="text-center border-top pt-3 set-my-color-text-background set-my-font-family-one">
                        Copyright 2023 The Codex All Rigth Reserved.
                    </div>
                </div>
            </div>
        </footer>
    </div>
</template>
<script lang="js">
import Nav from '../../components/NavBar.vue'
import NavSection from '../../components/NavSection.vue'
import myButton from '../../components/ButtonVue.vue'
export default {
    name: 'LayoutPrincipal',
    components:{
        Nav,
        NavSection,
        myButton
    },
    data() {
        return {
            checkRender : true,
            media:[
                {
                    href : "https://www.facebook.com/kevinalexis.rodriguezcondori/",
                    icon : "fa-brands fa-facebook fs-1 set-my-color-text-background"
                },
                {
                    href : "",
                    icon : "fa-brands fa-twitter fs-1 set-my-color-text-background "
                },
                {
                    href : "https://api.whatsapp.com/send?phone=59174242927&text=Hola%2C%20 revise tu perfil y me parese genial",
                    icon : "fa-brands fa-whatsapp fs-1 set-my-color-text-background"
                },
                {
                    href : "www.linkedin.com/in/kevin-alexis-rodriguez-condori/",
                    icon : "fa-brands fa-linkedin-in fs-1 set-my-color-text-background"
                },
                {
                    href : "https://github.com/",
                    icon : "fa-brands fa-github fs-1 set-my-color-text-background"
                }
            ],
            Footer:[
                    {
                        title:'Resourses',
                        children:[
                            {
                                title:'services'
                                
                            },
                            {
                                title:'membership'
                            },
                            {
                                title:'testimonial'
                            },
                            // {
                            //     title:'Contact Us',
                            // },
                        ]
                    },
                    {
                        title:'Usefull links',
                        children:[
                            {
                                title:'Terms of Services',
                            },
                            {
                                title:'Privacy Policy',
                            },
                            {
                                title:'Cookie Policy'
                            },
                        ]
                    },
                    {
                        title:'NewsLetter',
                        children:[
                            {
                                title:'Sing up and receive the lastest news via email',
                            },   
                        ]
                    },
            ]
        }
    },
    computed:{
        checkLocation(){
            console.log(this.$route.name )
            return (this.$route.name != 'Home')? !this.checkRender: this.checkRender
        }
    },
    
}
</script>
<style scoped>
    .set-footer-bg{
        background: url('../../assets/img/AnimatedShape2.svg'), #051114;
    }
    .set-glass-efect{
        background: transparent;
        box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
        backdrop-filter: blur( 14.5px );
        -webkit-backdrop-filter: blur( 14.5px );
        border-radius: 10px;
        border: 1px solid rgba(108, 107, 107, 0.18);
    }
    .codext{
        color: #00a9ff;
        font-weight: bold;
    }
    .set-my-form-border{
        border: 1px solid white;
    }
    .set-outline{
        outline: none !important;
        border: none;
    }

    input::-webkit-input-placeholder {
        padding-left: 10px;
        line-height: 100px;
        text-transform: uppercase;
    }
    ul li{
        margin-bottom: 5px;
    }
</style>