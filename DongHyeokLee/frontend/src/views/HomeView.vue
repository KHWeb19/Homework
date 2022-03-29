<template>
<div class="home">
  <div id="header">
            <router-link style="text-decoration: none;" :to="{ name: 'Home' }">
                &nbsp;Home&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'ProductListPage' }">
                &nbsp;상품리스트&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'Concave' }">
                &nbsp;이것이 삼목이닷!&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'VuetifyTest' }">
                &nbsp;Vuetify(뷰티파이) UI Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'CoverFlowTestPage' }">
                &nbsp;Cover Flow Test&nbsp;
            </router-link>
             <router-link style="text-decoration: none;" :to="{ name: 'VuetifyImageTestPage' }">
                &nbsp;VuetifyImageTestPage&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'CalendarTestPage' }">
                &nbsp;Calendar Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'AwesomeSwiperTestPage' }">
                &nbsp;Awesome Swiper Test&nbsp;
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
