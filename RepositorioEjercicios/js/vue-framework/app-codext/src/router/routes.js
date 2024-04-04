
import { createRouter, createWebHistory } from "vue-router";

//import App from '../App.vue'
import LayoutPrincipal from '../ui/layouts/LayoutPrincipal.vue'
import Home from '../ui/pages/Principal/MainLayout.vue'
import OperatingSystem from '../../src/ui/pages/Principal/MainLayoutComponets/OsSection.vue'
import services from '../ui/pages/Principal/MainLayoutComponets/FeaturesSection.vue'
import membership from '../ui/pages/Principal/MainLayoutComponets/SuscriptionSection.vue'
import testimonial from '../ui/pages/Principal/MainLayoutComponets/TestimonialSection.vue'
import teams from '../ui/pages/Principal/MainLayoutComponets/workerTeamSection.vue'
import SingIn from '../ui/pages/Auth/SingIn.vue'
import SingUp from '../ui/pages/Auth/SingUp.vue'
import ForgotPassword from '../ui/pages/Auth/GetPassword.vue'
const routes = [
  {
    path: '/',
    name: 'LayoutPrincipal',
    component: LayoutPrincipal,
    redirect:{
      name:Home,
    },
    children:[
      {
        path: '',
        component: Home,
        name : 'Home',
      },
      {
        path: '/OperatingSystem',
        component: OperatingSystem,
        name : 'OperatingSystem',
        
      },
      {
        path: '/Features',
        component: services,
        name : 'services',
      },
      {
        path: '/membership',
        component: membership,
        name : 'membership',
      },
      {
        path: '/testimonial',
        component: testimonial,
        name : 'testimonial',
      },
      {
        path: '/teams',
        component: teams,
        name : 'teams',
      },

      {
        path: '/SingIn',
        component: SingIn,
        name : 'SingIn',
      },
      {
        path: '/SingUp',
        component: SingUp,
        name : 'SingUp',
      },
      {
        path: '/ForgotPassword',
        component: ForgotPassword,
        name : 'ForgotPassword',
      }
    ]

  }
];

const history = createWebHistory();

const router = createRouter({
  history,
  routes,
});

export default router;