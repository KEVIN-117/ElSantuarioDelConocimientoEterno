<template>
    <div>
        <h1>hola mundo dashboard</h1>
        
    </div>
</template>

<script>
import Vue from "vue";
import 'core-js'

// Plugins
import GlobalComponents from "./globalComponents";
import GlobalDirectives from "./globalDirectives";
import Notifications from "./components/NotificationPlugin";
// MaterialDashboard plugin
import MaterialDashboard from "./material-dashboard";


Vue.use(MaterialDashboard);
Vue.use(GlobalComponents);
Vue.use(GlobalDirectives);
Vue.use(Notifications);

export default {};
</script>
