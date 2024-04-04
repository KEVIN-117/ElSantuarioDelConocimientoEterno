<template >
  <div>
      <router-view></router-view>
  </div>
</template>
<script>
export default {
  
}
</script>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Abel&family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap');
    @import url('https://fonts.googleapis.com/css2?family=Abel&family=Arimo:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap');
  
    :root{
      --my-bg-primary-color: #30302f;
      --my-bg: #ede6e1;
      --my-bg-secondary-color: #d25207;
      --my-bg-img-R: #bb413e;
      --my-bg-white: #ede6e1;
      --my-bg-cyan: #91bea9;
      --my-bg-tree:#a1cee4;
      --my-bg-image: #aacfed;
      --my-bg-image2:#e6a587;
      --my-text:'Abel';
      --my-text-two:'Arimo';
    }
    body::-webkit-scrollbar {
      width: 10px;
    }

    body::-webkit-scrollbar-thumb {
      background: var(--my-bg-cyan);
      border-radius: 10px;
    }
    body::-webkit-scrollbar-track {
      background: var(--my-bg);
      border-radius: 10px;
    }
</style>
