<template>
    <div>
        <OsSection/>
        <FeaturesSection/>
        <SuscriptionSection/>
        <TestimonialsSection/>
        <WorkerTEamSection/>
    </div>
</template>
<script>

import OsSection from './MainLayoutComponets/OsSection.vue'
import FeaturesSection from './MainLayoutComponets/FeaturesSection.vue';
import SuscriptionSection from './MainLayoutComponets/SuscriptionSection.vue'
import TestimonialsSection from './MainLayoutComponets/TestimonialSection.vue'
import WorkerTEamSection from './MainLayoutComponets/workerTeamSection.vue'

export default {
    name:'MainLayout',
    components:{
      OsSection,
      FeaturesSection,
      SuscriptionSection,
      TestimonialsSection,
      WorkerTEamSection
    },
}
</script>
<style scoped>

    
</style>