<template>
    <div class="">
        <div class="row m-2 p-2 text-center set-my-border-radius card">
            <div class="col-md-12">
                <h5 class="text-1 card-title  mb-4 set-my-text color-card" >{{title}}</h5>
                <h6 class="text-2 card-subtitle mb-4 text-muted mb-4 set-my-text color-card" >{{smallTitle}}</h6>
                <p class="text-3 card-text text-justify mb-5 set-my-text-two color-card set-my-text-two" >{{description}}</p>
            </div>
            <div class="col-md-12">
                <Button class="btn" :title="'LEARN MORE'" :desing="'d1'" style="width: 100%; margin: auto; "/>
            </div>
        </div> 
    </div>  
</template>
<script>
import Button from './Button.vue'
export default {
    components:{
        Button,
    },
    props:{
        title:String,
        smallTitle:String,
        description:String
    }
}
</script>
<style scoped src="../../assets/css/principal.css">
    /* .card-circle{
        position: absolute; 
        width: 90px; 
        height: 90px; 
        background-color: var(--my-bg-secondary-color); 
        left: -50px; top: -40px; 
        border-radius: 50% !important;
    }
    .card{
        background-color: var(--my-bg);
        
    }
    .color-card{
        color: var(--my-bg-primary-color) !important;
    }
    .btn{
        width: 80%;
        height: 60px;
        margin: auto;

    }
    .text-1{
        font-size: 3.5rem !important;
    }
    .text-2{
        font-size: 2.5rem !important;
    }
    .text-3{
        font-size: 1rem !important;
    }
    .set-my-border-radiusP{
        border-top-right-radius: 30px !important;
        border-bottom-left-radius: 30px !important;
        border-bottom-right-radius: 30px !important;
        
    } */
</style>