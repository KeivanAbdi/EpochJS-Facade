# EpochJS facade 
[Scala.JS](http://scala-js.org/) static typed facades for [EpochJS](https://github.com/epochjs/epoch) library

### Using the Library
Add the following to your sbt build definition:

```scala
resolvers += Resolver.sonatypeRepo("snapshots")
libraryDependencies +="com.keivanabdi" %%% "epochjs-facade" % "0.1.0-SNAPSHOT"
```
Include these JavaScript and CSS files in your web page:
```html 
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.17/d3.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/epoch/0.8.4/js/epoch.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/epoch/0.8.4/css/epoch.min.css">
```
### Examples

#### Basic Charts

* [Area Chart](http://epochjs.github.io/epoch/basic/#area) 
```scala
import com.keivanabdi.scalajs.epochjs.chart.basic.area._ 
                                                         
val data1 = (                                            
  Data(                                                  
    label = "Cos",                                       
    values = (0 to 128).map { x =>                       
      Value(x, Math.cos(4 * Math.PI * (x / 128.0)) + 1)  
    }                                                    
  ),                                                     
  Data(                                                  
    label = "Sin",                                       
    values = (0 to 128).map { x =>                       
      Value(x, Math.sin(4 * Math.PI * (x / 128.0)) + 1)  
    }                                                    
  )                                                      
)                                                        
                                                         
jQuery("#basic-area-example") epoch Chart(               
  data = data1,                                          
  axes = Some(Seq(Ax.bottom, Ax.left, Ax.right))         
)
```

* [Bar Chart](http://epochjs.github.io/epoch/basic/#bar)
```scala
import com.keivanabdi.scalajs.epochjs.chart.basic.bar._
                                                       
val data1 = Data(                                      
  label = "Series 1",                                  
  values = (1 to 15).map { i =>                        
    Value((64 + i).toChar.toString, Math.log(i))       
  }                                                    
)                                                      
                                                       
jQuery("#basic-bar-example") epoch Chart(              
  data = data1                                         
)                                                                                                     
```

* [Line Chart](http://epochjs.github.io/epoch/basic/#line)
```scala
import com.keivanabdi.scalajs.epochjs.chart.basic.line._
                                                        
val data1 = Data(                                       
  label = "Layer 1",                                    
  values = (0 to 128).map { i =>                        
    val x = 20 * (i / 128.0) - 10                       
    val y = Math.cos(x) * x                             
    Value(x, y)                                         
  }                                                     
)                                                       
jQuery("#basic-line-example") epoch Chart(              
  data = data1                                          
)
```
* [Pie Chart](http://epochjs.github.io/epoch/basic/#pie)
```scala
import com.keivanabdi.scalajs.epochjs.chart.basic.pie._
                                                       
val data1 = (                                          
  Data(label = "A", value = 30),                       
  Data(label = "B", value = 20),                       
  Data(label = "C", value = 50)                        
)                                                      
jQuery("#basic-pie-example") epoch Chart(              
  data  = data1,                                       
  inner = Some(58.0)                                   
)
```
* [Scatter Chart](http://epochjs.github.io/epoch/basic/#scatter)
```scala
import com.keivanabdi.scalajs.epochjs.chart.basic.scatter._
                                                           
val data1 = (                                              
  Data(                                                    
    label = "A",                                           
    values = (0 to 64) map { _ =>                          
      Value(Math.random() * 1000, Math.random() * 200)     
    }                                                      
  ),                                                       
  Data(                                                    
    label = "B",                                           
    values = (0 to 64) map { _ =>                          
      Value(Math.random() * 1000, Math.random() * 200)     
    }                                                      
  )                                                        
)                                                          
jQuery("#basic-scatter-example") epoch Chart(              
  data = data1                                             
)
```
<br />

#### Realtime Charts
* [Area Chart](http://epochjs.github.io/epoch/real-time/#area)
```scala
import com.keivanabdi.scalajs.epochjs.chart.realtime.area._    
                                                               
def generateRandomValue(): Value = Value(                      
  time = (System.currentTimeMillis() / 1000).toInt,            
  y    = Math.random() * 100                                   
)                                                              
                                                               
def generateRandomValues(n: Int): Seq[Value] = Seq.fill(n)(    
  generateRandomValue()                                        
)                                                              
                                                               
val data1 = (                                                  
  Data(                                                        
    label  = "Layer 1",                                        
    values = generateRandomValues(n = 60)                      
  ),                                                           
  Data(                                                        
    label  = "Layer 2",                                        
    values = generateRandomValues(n = 60)                      
  ),                                                           
  Data(                                                        
    label  = "Layer 3",                                        
    values = generateRandomValues(n = 60)                      
  )                                                            
)                                                              
                                                               
val chart = jQuery("#realtime-area-example") epoch Chart(      
  data = data1,                                                
  axes = Some(Seq(Ax.left, Ax.bottom, Ax.right))               
)                                                              
                                                               
scalajs.dom.window.setInterval(         
  () => {                               
    chart.push(                         
      generateRandomValue(), // Layer 1 
      generateRandomValue(), // Layer 2 
      generateRandomValue()  // Layer 3  
    )                                   
  },                                    
  1000                                  
)
```
* [Bar Chart](http://epochjs.github.io/epoch/real-time/#bar)
```scala
import com.keivanabdi.scalajs.epochjs.chart.realtime.bar._    
                                                               
def generateRandomValue(): Value = Value(                      
  time = (System.currentTimeMillis() / 1000).toInt,            
  y    = Math.random() * 100                                   
)                                                              
                                                               
def generateRandomValues(n: Int): Seq[Value] = Seq.fill(n)(    
  generateRandomValue()                                        
)                                                              
                                                               
val data1 = (                                                  
  Data(                                                        
    label  = "Layer 1",                                        
    values = generateRandomValues(n = 60)                      
  ),                                                           
  Data(                                                        
    label  = "Layer 2",                                        
    values = generateRandomValues(n = 60)                      
  ),                                                           
  Data(                                                        
    label  = "Layer 3",                                        
    values = generateRandomValues(n = 60)                      
  )                                                            
)                                                              
                                                               
val chart = jQuery("#realtime-bar-example") epoch Chart(      
  data = data1,                                                
  axes = Some(Seq(Ax.left, Ax.bottom, Ax.right))               
)                                                              
                                                               
scalajs.dom.window.setInterval(         
  () => {                               
    chart.push(                         
      generateRandomValue(), // Layer 1 
      generateRandomValue(), // Layer 2 
      generateRandomValue()  // Layer 3  
    )                                   
  },                                    
  1000                                  
)
```
* [Gauge Chart](http://epochjs.github.io/epoch/real-time/#gauge)
```scala
import com.keivanabdi.scalajs.epochjs.chart.realtime.gauge._
                                                            
val chart = jQuery("#realtime-gauge-example") epoch Chart(  
  Value(0.0)                                                
)                                                           
scalajs.dom.window.setInterval(                             
  () => {                                                   
    chart.update(Math.random())                             
  },                                                        
  1000                                                      
)
```
* [Heatmap Chart](http://epochjs.github.io/epoch/real-time/#heatmap)
```scala
import com.keivanabdi.scalajs.epochjs.chart.realtime.heatmap._                      
                                                                                    
def generateRandomValue(): Value = Value(                                           
  time = System.currentTimeMillis(),                                                
  histogram = Array                                                                 
    .fill(1000) {                                                                   
      val u = math.random()                                                         
      val v = math.random()                                                         
      ((math.sqrt(-2 * math.log(u)) * math.cos(2 * math.Pi * v)) * 12.5 + 50).toInt 
    }                                                                               
    .groupBy(x => x)                                                                
    .mapValues(_.length)                                                            
)        

def generateRandomValues(n: Int): Seq[Value] = Seq.fill(n)(                         
  generateRandomValue()                                                             
)     

val data1 = Data(                                                                   
  label = "Layer 1",                                                                
  values = generateRandomValues(n = 60)                                             
)  

val chart = jQuery("#realtime-heatmap-example") epoch Chart(                        
  data = data1,                                                                     
  buckets = Some(20),                                                               
  bucketRange = Some(0, 100),                                                       
  windowSize = Some(60),                                                            
  axes = Some(Seq(Ax.left, Ax.bottom, Ax.right)),                                   
  opacity = Some((v, max) => math.pow(v / max, 0.7))                                
)                                                                                   
                                                                                    
scalajs.dom.window.setInterval(                                                     
  () => {                                                                           
    chart.push(                                                                     
      generateRandomValue()                                                         
    )                                                                               
  },                                                                                
  1000                                                                              
)
```
* [Line Chart](http://epochjs.github.io/epoch/real-time/#line)
```scala
import com.keivanabdi.scalajs.epochjs.chart.realtime.line._ 
                                                            
def generateRandomValue(): Value = Value(                   
  time = (System.currentTimeMillis() / 1000).toInt,         
  y    = Math.random() * 100                                
)                                                           
                                                            
def generateRandomValues(n: Int): Seq[Value] = Seq.fill(n)( 
  generateRandomValue()                                     
)                                                           
                                                            
val data1 = (                                               
  Data(                                                     
    label  = "Layer 1",                                     
    values = generateRandomValues(n = 60)                   
  ),                                                        
  Data(                                                     
    label  = "Layer 2",                                     
    values = generateRandomValues(n = 60)                   
  )                                                         
)                                                           
                                                            
val chart = jQuery("#realtime-line-example") epoch Chart(   
  data = data1,                                             
  axes = Some(Seq(Ax.left, Ax.bottom, Ax.right))            
)                                                           
                                                            
scalajs.dom.window.setInterval(                             
  () => {                                                   
    chart.push(                                             
      generateRandomValue(), // Layer 1                     
      generateRandomValue()  // Layer 2                     
    )                                                       
  },                                                        
  1000                                                      
)
```
