import Vue from 'vue'
import {Meteor} from 'meteor/meteor'
import '../imports/ui/plugins'

import router from '../imports/routers/routes'

import App from '../imports/ui/App.vue'
/* import Mains from '../imports/ui/Mains.vue' */
import Chartist from 'chartist';
Vue.prototype.$Chartist = Chartist;

Meteor.startup(() => {
  /* new Vue({
    router,
    el: '#app',
    ...App,
  }) */

  new Vue({
    router,
    data: {
      Chartist: Chartist
    },
    render: (h) => h(App),
  }).$mount('#app');
})
