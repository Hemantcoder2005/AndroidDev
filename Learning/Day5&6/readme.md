# Creating First App - Unit Convertor
We are going to develop Unit app convertor

## Creating Toast
A toast is a small popup message that appears on the screen for a short period of time. It is used to provide users with feedback about an operation or event. Toasts are typically used to display short messages that do not require user interaction.
```kotlin
val context = LocalContext.current
Button(onClick = { Toast.makeText(context, "Thanks" ,Toast.LENGTH_LONG).show() }) {
    Text(text = "Button")
}  
```
## ArrowDropDown
Here is a code to build Arrow Drop Down Button

```kotlin
Button(onClick = { /*TODO*/ }) {
    Text(text = "Select")
    Icon(Icons.Default.ArrowDropDown, contentDescription = "ArrowDropDown")
}
```

## Alignment
```kotlin
 Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
```

## Spacer
```kotlin
Spacer(modifier = Modifier.width(10.dp))
```