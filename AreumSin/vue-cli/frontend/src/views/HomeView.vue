<template>
  <div class="home">
    <div id="header">
      <router-link :to="{ name: 'Home' }"
                   class="nav-link"
                   active-class="active">
        Home
      </router-link>
      <router-link :to="{ name: 'Test' }"
                   class="nav-link"
                   active-class="active">
        Test
      </router-link>
      <router-link :to="{ name: 'BoardListPage' }"
                   class="nav-link"
                   active-class="active">
        BoardListPage
      </router-link>
      <router-link :to="{ name: 'Concave' }"
                   class="nav-link"
                   active-class="active">
        &nbsp;이것이 삼목이닷!&nbsp;
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