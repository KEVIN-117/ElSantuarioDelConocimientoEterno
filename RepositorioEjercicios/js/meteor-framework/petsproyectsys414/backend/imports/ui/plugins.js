import Vue from 'vue'
import VueMeteorTracker from 'vue-meteor-tracker'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
import VueSweetalert2 from 'vue-sweetalert2';
// If you don't need the styles, do not connect
import 'sweetalert2/dist/sweetalert2.min.css';
import VueRouter from 'vue-router'

Vue.use(VueRouter)

Vue.use(VueMeteorTracker)

// Make BootstrapVue available throughout your project
Vue.use(BootstrapVue)
// Optionally install the BootstrapVue icon components plugin
Vue.use(IconsPlugin)

Vue.use(VueSweetalert2); 







