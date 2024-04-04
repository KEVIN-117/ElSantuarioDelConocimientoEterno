<template>
    <div>
      <h1>AQUI VA ESTAR NUESTRO DASHBOARDsds</h1>
        <h1><b>Nombre de usuario:</b> {{username}}</h1>
        <br>
        <button @click="logout">Cerrar session</button>

        <ul>
            <li v-for="t in getAllPost" :key="t.title">
                 <h1>{{t.title}}</h1>
            </li>
        </ul>

    </div>
</template>
<script>

export default {
  methods:{
        logout(){
            Meteor.logout()
            location.reload()
        }
  },
  computed:{
    username(){
      return Meteor.user()?.username            
      }
  },
    ///////////////////subcripcion/////////////////////
    meteor: {
    // Subscriptions - Errors not reported spelling and capitalization.
        $subscribe: {
            'publicacion_post': []
        },
        // A helper function to get the current time
        getAllPost(){
            let getpost = Post.find()
            return getpost
        }
    }
    ////////////////////////////////////////

}
</script>
<style>
    
</style>