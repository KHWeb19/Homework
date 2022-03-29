<template>
  <div>
    <coverflow :coverList="coverList" :coverWidth="260" :index="2" />
  </div>
</template>

<script>
import coverflow from "vue-coverflow";

export default {
  name: "Vuetify3",
  components: {
    coverflow,
  },
  data() {
    return {
      coverList: [
        { cover: require("@/assets/img/mario.png"), title: "mario" },
        { cover: require("@/assets/img/mario.png"), title: "mario" },
        { cover: require("@/assets/img/mario.png"), title: "mario" },
        { cover: require("@/assets/img/mario.png"), title: "mario" },
        { cover: require("@/assets/img/mario.png"), title: "mario" },
      ],
    };
  },
};
</script>