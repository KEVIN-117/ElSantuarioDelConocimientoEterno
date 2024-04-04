<template>
    <div>
        <span v-if="SetColor == 'cyan'" class="position-absolute my-z-index bg-svg" :style="{ left:SetPsotitonLEfth+'px', right: SetPositionRigth+'px', top:SetPositionTop+'px', bottom:SetPositionBottom+'px'}">
            <img src="/images/SVG_Cyan.svg" alt="" :width="SetWidth" :height="SetHeigth">
        </span>
        <span v-else-if="SetColor === 'orange'" class="position-absolute my-z-index bg-svg" :style="{ left:SetPsotitonLEfth+'px', right: SetPositionRigth+'px', top:'SetPositionTop', bottom:SetPositionBottom+'px'}">
            <img src="/images/SVG_Orange.svg" alt="" :width="SetWidth" :height="SetHeigth">
        </span>
        <span v-else-if="SetColor === 'white'" class="position-absolute my-z-index bg-svg" :style="{ left:SetPsotitonLEfth+'px', right: SetPositionRigth+'px', top:'SetPositionTop', bottom:SetPositionBottom+'px'}">
            <img src="/images/SVG_White.svg" alt="" :width="SetWidth" :height="SetHeigth">
        </span>
    </div>
</template>
<script>

export default {
    props:{
        SetColor: String,
        SetWidth: Number,
        SetHeigth: Number,
        SetPsotitonLEfth: Number,
        SetPositionRigth: Number,
        SetPositionTop: Number,
        SetPositionBottom: Number,
    },
}
</script>
<style scoped src="../../assets/css/principal.css">
    /* .bg-svg{
        background-color:transparent;
        
    }
    .my-z-index{
        z-index: 100;
    } */
</style>