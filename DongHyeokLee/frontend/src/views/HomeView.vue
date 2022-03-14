<template>
<div class="home">
  <div id="header">
   <router-link style="text-decoration: none;" :to="{ name: 'Home' }">
                &nbsp;Home&nbsp;
            </router-link>
  <router-link style="text-decoration: none;" :to="{ name: 'ProductListPage' }">
                &nbsp;상품리스트&nbsp;
            </router-link>
  </div>
</div>
</template>

<script>
  //import HelloWorld from '../components/HelloWorld'

  export default {
    name: 'HomeView',

    components: {
     
    },
  }
</script>
