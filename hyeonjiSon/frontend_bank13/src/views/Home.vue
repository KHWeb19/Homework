<template>
  <div class="home">
      <router-link :to="{ name: 'Home' }">
          &nbsp;Home&nbsp;
      </router-link>
      <router-link :to="{ name: 'MarketListPage' }">
          &nbsp;MarketListPage&nbsp;
      </router-link>
  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
  }
}
</script>