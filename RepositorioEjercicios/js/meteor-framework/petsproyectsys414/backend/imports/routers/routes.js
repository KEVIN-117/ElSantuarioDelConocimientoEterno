import Vue from 'vue'

import VueRouter from 'vue-router'
import App from '../ui/App.vue'
import SingIn from '../ui/pages/auth/SingIn.vue'
import SingUp from '../ui/pages/auth/SingUp.vue'
import DasboardLayout from '../ui/layouts/DasboardLayout.vue'
import Layout from '../ui/layouts/LayoutPrincipal.vue'
import principal from '../ui/pages/Principal/Principal.vue'


import AppDashboard from "../ui/pages/dashboard/AppDashboard.vue"
import DashboardLayout from "../ui/pages/dashboard/pages/Layout/DashboardLayout.vue";
import Dashboard from '../ui/pages/dashboard/pages/Dashboard.vue'
import UserProfile from "../ui/pages/dashboard/pages/UserProfile.vue";
import TableList from "../ui/pages/dashboard/pages/TableList.vue";
import Typography from "../ui/pages/dashboard/pages/Typography.vue";
import Icons from "../ui/pages/dashboard/pages/Icons.vue";
import Maps from "../ui/pages/dashboard/pages/Maps.vue";
import Notifications from "../ui/pages/dashboard/pages/Notifications.vue";
import UpgradeToPRO from "../ui/pages/dashboard/pages/UpgradeToPRO.vue";
///// estos son componentes para mi proyecti 
import AddFoot from "../ui/pages/dashboard/pages/views/AddFoot.vue";
import ListFoot from "../ui/pages/dashboard/pages/views/ListFoot.vue";
import CreatePublications from "../ui/pages/dashboard/pages/views/CreatePublications.vue"
import listPublications from "../ui/pages/dashboard/pages/views/listPublications.vue"

import AddPets from "../ui/pages/dashboard/pages/views/AddPets.vue"
import ListPet from "../ui/pages/dashboard/pages/views/ListPet.vue"
const routes = [
  /* {
    path: "/",
    name: "About",
    component: App
  }, */
  {
    path: '/',
    name: 'Layoutprincipal',
    component: Layout,
    redirect:{
        name:principal,
    },
    children: [
      {
        path:'',
        component:principal,
        name: 'principal',

      },
      {
        path: 'SingIn',
        name: 'login',
        component: SingIn,
      }, 
      {
        path: 'SingUp',
        name: 'register',
        components:{
          default: SingUp
        },
      }
    ]
  },
  {
    path:'/dashboard',
    name:"dashboardLayout",
    component:DashboardLayout,
    redirect:{
        name:'DashboardHome'
    },
    children: [
        {
          path: "/dashboard-home",
          name: "DashboardHome",
          component: Dashboard
        },
        {
          path: "/dashboard-home",
          name: "DashboardHome",
          component: Dashboard
        },
        {
          path: "add-foot",
          name: "Añadir alimentos",
          component: AddFoot          
        },
        {
          path: "list-foot",
          name: "Lista de productos",
          component: ListFoot
        },
        {
          path: "create-publications",
          name: "Crear Publicacion",
          component: CreatePublications
        },
        {
          path: "list-publications",
          name: "Listar Publicaciones",
          component: listPublications
          //listPublications
        },

        {
          path: "add-pets",
          name: "Añadir Macotas",
          component: AddPets
        },
        {
          path: "list-pets",
          name: "Listar Mascotas",
          component: ListPet
          //listPublications
        },

        {
          path: "user",
          name: "UserProfile",
          component: UserProfile
        },
        {
          path: "table",
          name: "TableList",
          component: TableList
        },
        {
          path: "typography",
          name: "Typography",
          component: Typography
        },
        {
          path: "icons",
          name: "Icons",
          component: Icons
        },
        {
          path: "maps",
          name: "Maps",
          meta: {
            hideFooter: true
          },
          component: Maps
        },
        {
          path: "notifications",
          name: "Notifications",
          component: Notifications
        },
        {
          path: "upgrade",
          name: "UpgradePRO",
          component: UpgradeToPRO
        }
    ]
  }
]


const router = new VueRouter({
  routes
});

router.beforeEach((to, from, next) => {
  let routesNotAuthentications = ['principal', 'login', 'register'];
  console.log(to)
  const isAuthenticated = Meteor.userId()
  console.log(isAuthenticated)
  if (routesNotAuthentications.includes(to.name) && !isAuthenticated){
    next();
  }else{
    if(isAuthenticated){
      next()
    }else{
      next({ name: 'login' })
    }
  }

});

export default router