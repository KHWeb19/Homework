<template>
  <div class="home">
    <div id="header">
      <router-link style="text-decoration: none" :to="{ name: 'Home' }">
        &nbsp;Home&nbsp;
      </router-link>
      <router-link style="text-decoration: none" :to="{ name: 'Test' }">
        &nbsp;Test&nbsp;
      </router-link>
      <router-link
        style="text-decoration: none"
        :to="{ name: 'BoardListPage' }"
      >
        &nbsp;BoardListPage&nbsp;
      </router-link>
      <router-link style="text-decoration: none" :to="{ name: 'Concave' }">
        &nbsp;이것이 삼목이닷!&nbsp;
      </router-link>
      <router-link
        style="text-decoration: none"
        :to="{ name: 'EventBusTestPage' }"
      >
        &nbsp;이것이 EventBusTestPage닷!&nbsp;
      </router-link>
      <router-link
        style="text-decoration: none"
        :to="{ name: 'ProductBoardListPage' }"
      >
        &nbsp;ProductBoardListPage&nbsp;
      </router-link>
      <router-link style="text-decoration: none" :to="{ name: 'Vuetify' }">
        &nbsp;Vuetify&nbsp;
      </router-link>
      <router-link style="text-decoration: none" :to="{ name: 'Vuetify2' }">
        &nbsp;Vuetify2&nbsp;
      </router-link>
      <router-link style="text-decoration: none" :to="{ name: 'Vuetify3' }">
        &nbsp;Vuetify3&nbsp;
      </router-link>
      <router-link style="text-decoration: none" :to="{ name: 'Vuetify4' }">
        &nbsp;Vuetify4&nbsp;
      </router-link>
      <router-link style="text-decoration: none" :to="{ name: 'Vuetify5' }">
        &nbsp;Vuetify5&nbsp;
      </router-link>
      <router-link style="text-decoration: none" :to="{ name: 'Calender' }">
        &nbsp;Calender&nbsp;
      </router-link>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: "Home",
  components: {},
};
</script>