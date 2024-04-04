<template>
    <div>
        <section id="pricing">
            <div class="container pt-5 pb-5">
                <div class="d-flex flex-column justify-content-center aling-items-center">
                    <div class="text-center set-my-font-family-one fs-1 mt-5">
                        Choose your best pricing plan
                    </div>
                    <div class="text-center set-my-font-family-one fs-3 d-flex justify-content-center">
                        <div class="ps-3 pe-3">Membership for {{ boolean? 'yearly': 'monthly' }} </div>
                        <div class="form-check form-switch">
                        <input class="form-check-input" v-model="boolean" type="checkbox" role="switch" id="flexSwitchCheckDefault">
                        </div>
                    </div>
                    <div class="container pt-5 pb-5" v-if="!boolean">
                        <div class="p-5 row gap-4 justify-content-center">
                            <div class="col-md-4 row justify-content-center">
                                <PlainSuscription 
                                    :typeSuscription="'Start-UP'" 
                                    :pricing=10
                                    :iconColor="red"
                                    :amountUser= 1
                                    :clipPathBg="'#5c13c6'"
                                />
                            </div>
                            <div class="col-md-4 row justify-content-center">
                                <PlainSuscription 
                                    :typeSuscription="'Classic'" 
                                    :pricing=30
                                    :iconColor="red"
                                    :amountUser= 2
                                    :clipPathBg="'#5c13c6'"
                                />
                            </div>
                            <div class="col-md-4 row justify-content-center">
                                <PlainSuscription 
                                    :typeSuscription="'Premium'" 
                                    :pricing=49
                                    :iconColor="red"
                                    :amountUser= 5
                                    :clipPathBg="'#5c13c6'"
                                />
                            </div>
                        </div>
                    </div>

                    <div class="container pt-5 pb-5" v-else>
                        <div class="p-5 row gap-4 justify-content-center">
                            <div class="col-md-4 row justify-content-center">
                                <PlainSuscription 
                                    :typeSuscription="'Start-UP'" 
                                    :pricing=15
                                    :iconColor="red"
                                    :amountUser= 2
                                    :clipPathBg="'#5c13c6'"
                                />
                            </div>
                            <div class="col-md-4 row justify-content-center">
                                <PlainSuscription 
                                    :typeSuscription="'Classic'" 
                                    :pricing=60
                                    :iconColor="red"
                                    :amountUser= 5
                                    :clipPathBg="'#5c13c6'"
                                />
                            </div>
                            <div class="col-md-4 row justify-content-center">
                                <PlainSuscription 
                                    :typeSuscription="'Premium'" 
                                    :pricing=100
                                    :iconColor="red"
                                    :amountUser= 10
                                    :clipPathBg="'#5c13c6'"
                                />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>  
    </div>
</template>
<script>
import PlainSuscription from '../../../../components/PlainSuscription.vue'
export default {
    name:'SuscriptionSection',
    components:{
      PlainSuscription
    },
    data: () => ({
        boolean: false,
  }),
}
</script>
<style>
    
</style>