<template >
    <div class="row">
        <div id="col-md-4 carouselExampleCaptions" class="carousel img-fluid m-2 slide" data-ride="carousel" v-for="(item, index) in listImages" :key="index">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleCaptions" :data-slide-to="item.data_slide" class="active"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img :src="item.img" :class="item.bgImg" class="d-flex set-my-border-radius w-100" alt="..." style="object-fit: cover; width: 100%; height: 100%;">
                    <div class="carousel-caption d-none d-md-block">
                        <Button :desing="'d1'" :title="item.title"/>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import Button from './Button.vue'
import Titles from './TitleContent.vue'
export default {
    
    components:{
        Button,
        Titles,
    },
    data() {
        return {
            listImages:[
                {
                    title:"aseo",
                    img:'/images/Group5Img1.svg',
                    bgImg:"set-bg-img2",
                    data_slide: '0',
                },
                {
                    title:"hotel",
                    img:'/images/Group5Img4.svg',
                    bgImg:"set-my-bg-secondary",
                    data_slide: '1',
                },
                {
                    title:"salud",
                    img:'/images/Group5Img2.svg',
                    bgImg:"set-bg-img2",
                    data_slide: '2',
                },
                {
                    title:"PAQUETE COMPLETO",
                    img:'/images/Group5Img3.svg',
                    bgImg:"set-my-bg-secondary",
                    data_slide: '3',
                }               
                
            ]
        }
    },
}
</script>
<style src="../../assets/css/principal.css">
.cta {
 position: relative;
 margin: auto;
 padding: 12px 18px;
 transition: all 0.2s ease;
 border: none;
 background: none;
}

.cta:before {
 content: "";
 position: absolute;
 top: 0;
 left: 0;
 display: block;
 border-radius: 50px;
 background: #b1dae7;
 width: 45px;
 height: 45px;
 transition: all 0.3s ease;
}

.cta span {
 position: relative;
 font-family: "Ubuntu", sans-serif;
 font-size: 18px;
 font-weight: 700;
 letter-spacing: 0.05em;
 color: #234567;
}

.cta svg {
 position: relative;
 top: 0;
 margin-left: 10px;
 fill: none;
 stroke-linecap: round;
 stroke-linejoin: round;
 stroke: #234567;
 stroke-width: 2;
 transform: translateX(-5px);
 transition: all 0.3s ease;
}

.cta:hover:before {
 width: 100%;
 background: #b1dae7;
}

.cta:hover svg {
 transform: translateX(0);
}

.cta:active {
 transform: scale(0.95);
}
</style>