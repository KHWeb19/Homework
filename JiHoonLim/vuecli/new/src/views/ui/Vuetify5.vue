<template>
  <div>
    <v-container>
      <v-row>
        <v-col
          v-for="image in images"
          :key="image"
          class="d-flex child-flex"
          cols="4"
        >
          <v-img :src="image" aspect-ratio="1" class="orange lighten orange-3">
            <template v-slot:placeholder>
              <v-row class="fill-height ma-0" align="center" justify="center">
                <v-progress-circular
                  indeterminate
                  color="orange lighten-5"
                ></v-progress-circular>
              </v-row>
            </template>
          </v-img>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  components: {},
  data() {
    return {
      images: [
        require("@/assets/img/mario.png"),
        require("@/assets/img/dune.jpg"),
        "https://www.shinsegaegroupnewsroom.com/wp-content/uploads/2021/07/%EC%8A%A4%ED%83%80%EB%B2%85%EC%8A%A4_%EB%B3%B8%EB%AC%B89002-1.png",
        "https://www.newsfc.co.kr/news/photo/202111/48990_41604_1214.png",
      ],
    };
  },
};
</script>