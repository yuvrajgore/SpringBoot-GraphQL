This will contains spring boot with grpahql and docker file integration

docker pull command: docker pull yuvrajgore/graphqlbasics
Rest End Point:You can access below rest endpoint:
[/api/v1/home](http://localhost:8009/api/v1/home)

GraphQL end points:
http://localhost:8009/graphql
with below queries you can use,
 query{
      allBooks{
          id
          title
          description
          price
      }
      getBook(bookId:1){
          title
          description
      }
 }

 
 mutation{
     createBook(book:{
         title:"TitleG",
         description:"DescG",
         price:500,
         pages:200
         author:"AuthorG"
     }){
         id
         title
     }
 }
