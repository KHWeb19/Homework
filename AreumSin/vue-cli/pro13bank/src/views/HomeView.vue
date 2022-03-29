<template>
  <div class="home">
    <router-link :to="{name: 'TestView'}">TestView</router-link>
    <router-link :to="{name: 'ProductListPage'}">TestView</router-link>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: 'HomeView',
  components: {

  }
}
</script>
