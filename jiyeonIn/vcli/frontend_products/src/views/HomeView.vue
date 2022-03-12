<template>
  <div class="home">
        <div id="header">
            <router-link style="text-decoration: none;" :to="{ name: 'HomeView' }">
                &nbsp;Home&nbsp;
            </router-link>
            
            <router-link style="text-decoration: none;" :to="{ name: 'ProductListPage' }">
                &nbsp;BoardListPage&nbsp;
            </router-link>
            
            <router-link style="text-decoration: none;" :to="{ name: 'EventBusTestPage' }">
                &nbsp;이것이 eventbus닷!&nbsp;
            </router-link>
        </div>
  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
  }
}
</script>