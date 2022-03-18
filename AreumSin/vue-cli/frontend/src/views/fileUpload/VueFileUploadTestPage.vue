<template>
  <div>
    <v-container>
      <h3>vue 파일 업로드</h3>
      <div>
        <label>flie
          <input type="file" id="files" ref="files" multiple v-on:change="handleFileUpload()">
        </label>
        <button v-on:click="submitFiles()">파일 업로드</button>
      </div>
    </v-container>
  </div>

</template>

<script>
import axios from "axios";

export default {
  name: "VueFileUploadTestPage",
  data () {
    return {
      files: '',
      response: ''
    }
  },
  methods: {
    handleFileUpload () {
      this.files = this.$refs.files.files
    },
    submitFiles () {
      let formDate = new FormData()

      for (let idx = 0; idx < this.files.length; idx++) {
        formDate.append('fileList', this.files[idx]);
      }

      axios.post('http://localhost:7777/file/uploadImg', formDate, {
        headers: {
          'Content-Type' : 'multipart/form-data'
        }
      }).then (res => {
        alert('처리 결과 : '+ res.data);
      }).catch( res => {
        this.response = res.message;
      })


    }
  }
}
</script>

<style scoped>

</style>