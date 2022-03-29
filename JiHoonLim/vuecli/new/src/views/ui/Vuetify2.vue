<template>
  <div>
    <div>
      <v-img class="responsive-img" src="@/assets/img/mario.png" />
    </div>
    <div class="video-container">
      <iframe
        width="1200"
        height="720"
        src="https://www.youtube.com/embed/3AyCy1UUlpU"
        frameborder="0"
        allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      ></iframe>
    </div>
    <div class="row">
      <div class="col-4 col-md-8 col-sm-12 orange text-center">12</div>
      <div class="col-sm-2 green text-center">2</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
      <div class="col-sm-1 blue text-center">1</div>
    </div>

    <v-app id="inspire">
      <v-container class="orange lighten-3">
        <v-row no-gutters>
          <v-col cols="12" sm="6" md="8">
            <v-card class="pa-2" outlined tile> 1 </v-card>
          </v-col>
        </v-row>
      </v-container>
      <v-container class="grey lighten-5">
        <v-row no-gutters>
          <v-col class="col-12 col-sm-12 yellow text-center">
            <div>12</div>
          </v-col>
          <v-col class="col-12 col-sm-2 green text-center">
            <div>2</div>
          </v-col>
          <v-col class="col-12 col-sm-4 blue text-center">
            <div>4</div>
          </v-col>
          <v-col class="col-12 col-sm-6 purple text-center">
            <div>6</div>
          </v-col>
        </v-row>
      </v-container>
    </v-app>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {},
};
</script>

<style scoped>
.v-application p {
  margin-bottom: 0px;
}
</style>