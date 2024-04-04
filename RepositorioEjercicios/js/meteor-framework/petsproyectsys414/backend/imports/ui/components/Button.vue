<template>
    <div>
        <button v-if="desing == 'd1'" class="set-my-border-radius pl-3 pr-3 pt-2 pb-2 btn-secondary my-2 my-sm-0 border border-white" type="submit">{{title}} <i class="fa-solid" :clas='icon'></i></button>
        <button v-else-if="desing == 'd2'" class="set-my-border-radius pl-3 pr-3 pt-2 pb-2 btn-secondary2 my-2 my-sm-0 border border-white" type="submit">{{title}} <i class="fa-solid" :clas='icon'></i></button>
        <button v-else-if="desing == 'd3'" class="set-my-border-radius button  pl-4 pr-4" type="submit" >{{title}}</button>
    </div>
</template>
<script>
export default {
    props:{
        title:String,
        desing:String,
        icon:String,
    }
}
</script>
<style scoped src="../../assets/css/principal.css">
    /* .btn-secondary{
        border: none !important;
        background-color: var(--my-bg-secondary-color) !important;
        color: var(--my-bg-white) !important;
    }
    .btn-secondary2{
        background-color: transparent;
        border: 2px var(--my-bg-secondary-color) solid !important;
        color: var(--my-bg-secondary-color)!important;
    }

    .button{
        
        border-radius: 100px !important;
        background-image: linear-gradient(to right top, #ede6e1, #e5ddd1, #d8d4c2, #c6cdb5, #b1c7ad, #a5c6b0, #99c5b4, #8dc3ba, #8ec7c6, #91c9d1, #98ccdb, #a1cee4);
        box-shadow: 0 0 10px var(--my-bg-primary-color);
        font-size: 1.5em;
        text-transform: uppercase;
        font-weight: 900;
        letter-spacing: 5px;
    }
    .button:active{
        border-radius: 100px !important;
        background-image: linear-gradient(to left bottom, #ede6e1, #e5ddd1, #d8d4c2, #c6cdb5, #b1c7ad, #a5c6b0, #99c5b4, #8dc3ba, #8ec7c6, #91c9d1, #98ccdb, #a1cee4);
        
    }
</style>