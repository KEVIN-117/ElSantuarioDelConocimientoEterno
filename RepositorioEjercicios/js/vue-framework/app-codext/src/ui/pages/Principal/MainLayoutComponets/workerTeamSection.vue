<template>
    <div>
        <div class="set-my-heigth">
            <div class="container pt-5 pb-5 ">
                <div class="row gap-2 justify-content-center">
                    <div class="col-md-5">
                        <Team 
                            :img="'./Avatar/gheaghae.jpg'"
                            :teamType="'Our Creative Team'"
                            :date="'17 June, 2021'"
                            :author="'By Stive Smithi'"
                            :title="'Running remote offsites and onbordings'"
                            :body="'Some quick example text to build on the card title and make up the bulk of the cards content.'"
                        />
                    </div>
                    <div class="col-md-5">
                        <Team 
                            :img="'./Avatar/elizabethHenstridge.jpg'"
                            :teamType="'Create Presentations'"
                            :date="'17 June, 2021'"
                            :author="'By Thomas Lews'"
                            :title="'A new look & new wais to collaborate'"
                            :body="'Some quick example text to build on the card title and make up the bulk of the cards content.'"
                        />
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import Team from '../../../../components/TeamWorker.vue'
export default {
    name:'workerTeamSection',
    components:{
        Team
    }
}
</script>
<style>
    
</style>