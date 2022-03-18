<template>
  <div>
    <v-container>
      <v-row>
        <v-col v-for="image in images" :key="image" class="d-flex child-flex" cols="4">
          <v-img :src="image" aspect-ratio="1">
            <template v-slot:placeholder>
              <v-row class="fill-height ma-0" align="center" justify="center">
                <v-progress-circular indeterminate color="pink"></v-progress-circular>
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
  name: "ImageGalleryTestPage",
  data() {
    return {
      images: [
          require('../../assets/img/kai.jpg'),
          require('../../assets/img/kai2.jpg'),
          require('../../assets/img/kai2.jpg'),

      ]
    }
  }
}
</script>

<style scoped>

</style>