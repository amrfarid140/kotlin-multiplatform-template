import UIKit
import commonCode

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
		label.text = SampleKt.hello()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
}
