<template>
  <div class="home">
     <div id="header">
       <router-link :to="{ name: 'HomeView' }">
         Home
       </router-link>
       <router-link :to="{ name: 'ProductListPage' }">
         ProductList
       </router-link>
     </div>
  </div>
</template>

<script>

export default {
  name: 'HomeView',
  components: {
  }
}
</script>
