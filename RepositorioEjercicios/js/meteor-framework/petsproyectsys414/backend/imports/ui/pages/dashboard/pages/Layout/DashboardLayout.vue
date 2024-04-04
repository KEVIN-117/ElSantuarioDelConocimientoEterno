<template>
  <div class="wrapper" :class="{ 'nav-open': $sidebar.showSidebar }">
    <notifications></notifications>

    <side-bar
      :sidebar-item-color="sidebarBackground"
      :sidebar-background-image="sidebarBackgroundImage"
    >
      <mobile-menu slot="content"></mobile-menu>
      <sidebar-link to="/dashboard">
        <md-icon>dashboard</md-icon>
        <p class="menuOptionsAdd">Dashboard</p>
      </sidebar-link>

      <sidebar-link :to="{name:'Añadir alimentos'}">
        <md-icon>art_track</md-icon>
        <p class="menuOptionsAdd">Añadir alimentos</p>
      </sidebar-link>
      <sidebar-link :to="{name:'Lista de productos'}">
        <md-icon>auto_awesome_motion</md-icon>
        <p class="menuOptionsList">Listar Alimentos</p>
      </sidebar-link>

      
      <sidebar-link :to="{name:'Crear Publicacion'}">
        <md-icon>art_track</md-icon>
        <p class="menuOptionsAdd">Crear Publicacion</p>
      </sidebar-link>

      <sidebar-link :to="{name:'Listar Publicaciones'}">
        <md-icon>auto_awesome_motion</md-icon>
        <p class="menuOptionsList">Listar Publicaciones</p>
      </sidebar-link>

      <sidebar-link :to="{name:'Añadir Macotas'}">
        <md-icon>art_track</md-icon>
        <p class="menuOptionsAdd">Añadir Macotas</p>
      </sidebar-link>

      <sidebar-link :to="{name:'Listar Mascotas'}">
        <md-icon>auto_awesome_motion</md-icon>
        <p class="menuOptionsList">Listar Mascotas</p>
      </sidebar-link>

      <!-- <sidebar-link :to="{name:'UserProfile'}">
        <md-icon>person</md-icon>
        <p>User Profile</p>
      </sidebar-link>
      <sidebar-link :to="{name:'TableList'}">
        <md-icon>content_paste</md-icon>
        <p>Table list</p>
      </sidebar-link>
      <sidebar-link :to="{name:'Typography'}">
        <md-icon>library_books</md-icon>
        <p>Typography</p>
      </sidebar-link>
      <sidebar-link :to="{name:'Icons'}">
        <md-icon>bubble_chart</md-icon>
        <p>Icons</p>
      </sidebar-link>
      <sidebar-link :to="{name:'Maps'}">
        <md-icon>location_on</md-icon>
        <p>Maps</p>
      </sidebar-link>
      <sidebar-link :to="{name:'Notifications'}">
        <md-icon>notifications</md-icon>
        <p>Notifications</p>
      </sidebar-link>
      <sidebar-link :to="{name:'UpgradePRO'}" class="active-pro">
        <md-icon>unarchive</md-icon>
        <p>Upgrade to PRO</p>
      </sidebar-link> -->
    </side-bar>

    <div class="main-panel">
      <top-navbar></top-navbar>

      <fixed-plugin
        :color.sync="sidebarBackground"
        :image.sync="sidebarBackgroundImage"
      >
      </fixed-plugin>

      <dashboard-content> </dashboard-content>

      <content-footer v-if="!$route.meta.hideFooter"></content-footer>
    </div>
  </div>
</template>

<script>
import TopNavbar from "./TopNavbar.vue";
import ContentFooter from "./ContentFooter.vue";
import DashboardContent from "./Content.vue";
import MobileMenu from "./MobileMenu.vue";
import FixedPlugin from "./Extra/FixedPlugin.vue";

export default {
  components: {
    TopNavbar,
    DashboardContent,
    ContentFooter,
    MobileMenu,
    FixedPlugin
  },
  data() {
    return {
      sidebarBackground: "green",
      sidebarBackgroundImage: "/images/sidebar-2.jpg"
      //sidebarBackgroundImage: require("@/assets/img/sidebar-2.jpg")
    };
  },
  mounted() {
    let styleVueMaterial = require("vue-material/dist/vue-material.css");
    styleVueMaterial.id = 'materialOne'
    let materialDashboard = require("../../assets/scss/material-dashboard.scss");
    materialDashboard.id = 'materialTwo'
    document.head.appendChild(styleVueMaterial);
    document.head.appendChild(materialDashboard);
  },
};
</script>

<style>
  .menuOptionsAdd{
    color: white !important;
  }
  .menuOptionsList{
    color: azure !important;
  }
</style>
