<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script>


export default {
  name: 'App',
  components: {
    
  },
  
}
</script>

<style>
  @import url('https://fonts.googleapis.com/css2?family=Tilt+Neon&display=swap');
  @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');
  :root{
      --my-color-text-background: #ffffff;
      --my-bg-one:#ffffff;
      --my-bg-two:#ffffff00;
      --my-button-bg: #00a9ff;
      --my-footer-background: #051114;
      --my-card-bg: #5c13c6;
      --my-font-family-one: 'Poppins', sans-serif;
      --my-font-family-two: 'Tilt Neon', cursive;

  }
  body::-webkit-scrollbar {
      width: 0;
  }



  .set-header-bg{
    background-image: linear-gradient(to right bottom, #5218a5, #5c20b1, #6527be, #6f2fca, #7936d7);
  }

  .set-my-heigth{
    height: auto !important;
  }
  .set-my-heigth-static{
    height: 50% !important;
  }

  .set-my-color-text-background{
     color: var(--my-color-text-background);
  }
  .set-my-font-family-one{
    font-family: var(--my-font-family-one);
  }

  .set-my-font-family-two{
    font-family: var(--my-font-family-two);
  }

  .set-my-bg-one{
    background: var(--my-bg-one);
  }
  .set-my-bg-two{
    background: var(--my-bg-two) !important;
  }
  .set-my-bg-circles{
    background: url('./assets/img/circle-scatter-haikei.svg');
    background-position: center;
    background-size: cover;
  }
  .set-my-bg-poligon{
    background: url('./assets/img/Polygon\ Luminary.svg');
    background-size: cover;
    background-repeat: no-repeat;
  }

  .set-glass-efect{
    background: rgba( 255, 255, 255, 0.05 );
    box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.37 );
    backdrop-filter: blur( 14.5px );
    -webkit-backdrop-filter: blur( 14.5px );
    border-radius: 10px;
    border: 1px solid rgba(108, 107, 107, 0.18);
  }

  .set-bg-animations-shape{
    background: url('./assets/img/Animated\ Shape.svg'), linear-gradient(to right bottom, #5218a5, #5c20b1, #6527be, #6f2fca, #7936d7);
  }
  
  .text-sky-500{
    color: var(--my-button-bg);
  }

  .codext{
    color: var(--my-button-bg);
    font-weight: bold;      
  }

</style>
